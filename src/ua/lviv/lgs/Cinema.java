package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cinema {
    TreeMap<Days, Schedule> schedules;
    ArrayList<Movie> moviesLibrary = new ArrayList<>();
    private Time open;
    private Time close;

    public Cinema(TreeMap<Days, Schedule> schedules, ArrayList<Movie> moviesLibrary, Time open, Time close) {
        this.schedules = schedules;
        this.moviesLibrary = moviesLibrary;
        this.open = open;
        this.close = close;
    }

    public TreeMap<Days, Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(TreeMap<Days, Schedule> schedules) {
        this.schedules = schedules;
    }

    public ArrayList<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }

    public void setMoviesLibrary(ArrayList<Movie> moviesLibrary) {
        this.moviesLibrary = moviesLibrary;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }
    public void addMovie(Movie movie, Time...time){
        moviesLibrary.add(movie);
    }
    public void addSeance(Seance seance, String day){
        Days daysEnum = Days.valueOf(day.toString());
        Schedule schedule = schedules.get(daysEnum);
        schedule.addSeance(seance);
    }
    public void removeSeance(Seance seance, String days){
        Days daysEnum = Days.valueOf(days.toString());
        Schedule schedule = schedules.get(daysEnum);
        schedule.removeSeance(seance);
    }
    public void removeMovie(Movie movie) {
        moviesLibrary.remove(movie);
        schedules.values().stream()
                .flatMap(schedule -> schedule.getSeances().stream())
                .filter(seance -> seance.getMovie().equals(movie))
                .collect(Collectors.toList()).remove(movie);

        schedules.values().stream()
                .forEach(sched -> seancesToRemove
                        .stream()
                        .foreach(seance -> sched.removeSeance(sched));


    }



}

package ua.lviv.lgs;

public class Seance {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime, Time endTime) {
        this.movie = movie;
        this.startTime = startTime;
       this.endTime = new Time(startTime.getHour(), startTime.getMinute()).add(movie.getDuration());

    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public static void main(String[] args) {

  //Seance kj = new Seance();
      Time df = new Time(11,1);
      df.add(new Time(12,2));
//        Movie dk = new Movie("df", new Time(45,4));
//        System.out.println(dk);
//        System.nanoTime()
    }


}

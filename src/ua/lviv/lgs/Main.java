package ua.lviv.lgs;

import ua.lviv.lgs.Cinema;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Days, Schedule> schedules = new TreeMap<>();
        schedules.put(Days.MONDAY, new Schedule());
        schedules.put(Days.TUESDAY, new Schedule());
        schedules.put(Days.WEDNESDAY, new Schedule());
        schedules.put(Days.THURSDAY, new Schedule());
        schedules.put(Days.FRIDAY, new Schedule());
        schedules.put(Days.SATURDAY, new Schedule());
        schedules.put(Days.SUNDAY, new Schedule());

        ArrayList<Movie> moviesLibrary = new ArrayList<>();
        Time open = new Time(7, 0);
        Time close = new Time(19, 1);

        Cinema cinema = new Cinema(schedules, moviesLibrary, open, close);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option: ");
            System.out.println("1 add a movie: ");
            System.out.println("2 add a seance: ");
            System.out.println("3 remove a seance: ");
            System.out.println("4 remove a movie: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the title of the movie: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Enter the duration of the movie in hours: ");
                    int hour = scanner.nextInt();
                    System.out.println("Enter the duration of the movie in minutes: ");
                    int minutes = scanner.nextInt();
                    Time duration = new Time(minutes, hour);
                    Movie movie = new Movie(title, duration);
                    cinema.addMovie(movie);
                    System.out.println("Movie added");
                    break;
                case 2:
                    System.out.println("Enter the title of the movie to add to the seance: ");
                    scanner.nextLine();
                    String movieTitle = scanner.nextLine();
                    System.out.println("Enter the duration of the movie in hours: ");
                    int hour1 = scanner.nextInt();
                    System.out.println("Enter the duration of the movie in minutes: ");
                    int minutes1 = scanner.nextInt();
                    Time duration1 = new Time(minutes1, hour1);
                    System.out.println("Enter the start time of the seance (hours): ");
                    int startTimeHour = scanner.nextInt();
                    System.out.println("Enter the start time of the seance (minutes): ");
                    int startTimeMin = scanner.nextInt();
                    Time startTime = new Time(startTimeHour, startTimeMin);
                    scanner.nextLine();
                    System.out.println("Enter the day of the seance (in capital letters): ");
                    String day = scanner.nextLine();
                    Seance seance = new Seance(new Movie(movieTitle, duration1), startTime);
                    cinema.addSeance(seance, day);
                    System.out.println("Seance added successfully.");
                    break;
                case 3:
                    System.out.println("Enter the title of the movie to add to the seance: ");
                    scanner.nextLine();
                    String movieTitle2 = scanner.nextLine();
                    System.out.println("Enter the duration of the movie in hours: ");
                    int hour2 = scanner.nextInt();
                    System.out.println("Enter the duration of the movie in minutes: ");
                    int minutes2 = scanner.nextInt();
                    Time duration2 = new Time(minutes2, hour2);
                    System.out.println("Enter the start time of the seance (hours): ");
                    int startTimeHour2 = scanner.nextInt();
                    System.out.println("Enter the start time of the seance (minutes): ");
                    int startTimeMin2 = scanner.nextInt();
                    Time startTime2 = new Time(startTimeHour2, startTimeMin2);
                    scanner.nextLine();
                    System.out.println("Enter the day of the seance (in capital letters): ");
                    String day2 = scanner.nextLine();
                    Seance seance2 = new Seance(new Movie(movieTitle2, duration2), startTime2);
                    cinema.addSeance(seance2, day2);
                    System.out.println("Seance removed successfully.");
                    break;
                case 4:
                    System.out.println("Enter the title of the movie: ");
                    scanner.nextLine();
                    String title3 = scanner.nextLine();
                    System.out.println("Enter the duration of the movie in hours: ");
                    int hour3 = scanner.nextInt();
                    System.out.println("Enter the duration of the movie in minutes: ");
                    int minutes3 = scanner.nextInt();
                    Time duration3 = new Time(minutes3, hour3);
                    Movie movie3 = new Movie(title3, duration3);
                    cinema.removeMovie(movie3);
                    System.out.println("Movie removed");
                    break;
            }


        }
    }
}
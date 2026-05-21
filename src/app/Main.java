package app;

public class Main {

    public static void main(String[] args) {

        DayAdviser adviser = new DayAdviser();

        adviser.advise(Day.MONDAY);

        adviser.advise(Day.FRIDAY);

        adviser.advise(Day.SATURDAY);
    }
}
package app;

class DayAdviser implements Adviser {

    @Override
    public void advise(Day day) {

        switch (day) {

            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:

                System.out.println("Будьте продуктивними: плануйте задачі та працюйте без відволікань!");
                break;

            case FRIDAY:

                System.out.println("Happy Friday!");
                break;

            case SATURDAY:
            case SUNDAY:

                System.out.println("Рекомендую відвідати парк, кіно або поїхати на природу.");
                break;
        }
    }
}
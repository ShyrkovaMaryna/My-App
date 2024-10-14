package HomeWork15;

public class DayOfWeek implements DayAdvise {
    @Override
    public void advice(Day day) {
        switch (day){
            case MONDAY:
                System.out.println("The working week has begun!!!Create a to-do list for each day!!!" +
                        " Have a nice productive day :)");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday!!! Don't be lazy!!!" +
                        " Have a nice productive day :)");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday is a little Friday! Manage your time wisely!" +
                        "Have a nice productive day :)");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday. Minimize distractions! Avoid multitasking!" +
                        "Have a nice productive day :)");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Have a nice weekend:) " +
                        "Don't sit at home, have fun!" +
                        " Visit a cafe, cinema, museum, or go to nature :)");
                break;
            default:
                System.out.println("Oops, something's wrong.");
        }
    }
}

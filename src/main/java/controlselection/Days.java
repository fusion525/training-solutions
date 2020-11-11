package controlselection;

public class Days {
    public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg){
        String typeOfDay;
        switch(dayOfWeekArg){ //csak String és enum lehet benne.
            case "Monday":
                typeOfDay="Start of the work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay="Midweek";
                break;
            case "Friday":
                typeOfDay="End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay="Weekend";
                break;
            default:
                throw new IllegalArgumentException("Unknown day");
        }

        return typeOfDay;

    }

    public static void main(String[] args) {
        Days day = new Days();

        System.out.println(day.getTypeOfDayWithSwitchStatement("Friday"));
    }

}

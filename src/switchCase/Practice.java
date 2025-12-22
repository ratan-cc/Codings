package switchCase;
/*Example of Switch case java 17 */
public class Practice {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Days";
        };
        System.out.println(dayName);

        String work =switch (day){
          case 1,2,3,4,5 -> "Working Days";
          case 6,7 -> "Weekends";
            default -> "Invalid Days";
        };
        System.out.println(work);
    }
}


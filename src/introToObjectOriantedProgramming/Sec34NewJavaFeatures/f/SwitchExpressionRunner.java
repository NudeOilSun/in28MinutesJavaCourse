package introToObjectOriantedProgramming.Sec34NewJavaFeatures.f;

public class SwitchExpressionRunner {
    public static String FindDayOFTheWeek(int day){
       String result = switch (day){
           case 0 -> "Monday";
           case 1 -> "Tuesday";
           case 2 -> "Wednesday";
           case 3 -> "Thursday";
           case 4 -> "Friday";
           case 5 -> "Saturday";
           case 6-> "Sunday";
           default -> throw new IllegalArgumentException("invalid option: "+ day);
       };

       return result;
    }

    public static void main(String[] args) {
        System.out.println(FindDayOFTheWeek(3));
    }
}

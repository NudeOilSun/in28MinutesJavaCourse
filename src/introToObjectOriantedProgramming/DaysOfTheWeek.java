package introToObjectOriantedProgramming;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String theDay = "";

        for(String day:daysOfTheWeek) {
            int max = 0;
            if (day.length() > theDay.length()) {
                theDay = day;
            }
        }

        System.out.println(theDay);

        for(int i = daysOfTheWeek.length-1; i >=  0; i--){
            System.out.println(daysOfTheWeek[i]);
        }
    }
}


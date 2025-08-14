package introToObjectOriantedProgramming.Sec34NewJavaFeatures.f;

import java.time.DayOfWeek;

public class SwitchEnumsRunner {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;

        String str = switch (dayOfWeek){
            case MONDAY -> "first day of the week";
            case TUESDAY, WEDNESDAY, THURSDAY -> "Middle of the work week";
            case FRIDAY -> "last day of work week";
            default -> "Weekend";
        };

        System.out.println(str);
    }
}

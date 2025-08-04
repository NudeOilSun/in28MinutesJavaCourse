package introToObjectOriantedProgramming.Section31JavaTips;

import java.util.Arrays;

enum Seasons{
    WINTER(1),
    FALL(2),
    SUMMER(3),
    SPRING(4);

    private int value;
    private Seasons(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class EnumRunner {
    public static void main(String[] args) {
        Seasons season = Seasons.FALL;

        System.out.println(Seasons.WINTER.ordinal());
        System.out.println(Seasons.WINTER.getValue());

        Seasons season1 = Seasons.valueOf("WINTER");
        System.out.println(season1);

        System.out.println(Arrays.toString(Seasons.values()));
    }
}

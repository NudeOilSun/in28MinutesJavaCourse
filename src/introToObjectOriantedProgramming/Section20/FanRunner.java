package introToObjectOriantedProgramming.Section20;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("man 1", 123, "green");
        fan.setIsOn(true);
        fan.setSpeed((byte)4);
        System.out.println((fan.toString()));
    }
}

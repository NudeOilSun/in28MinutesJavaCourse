package introToObjectOriantedProgramming.Section29Exceptions;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }

    private static void method1() {
        String str = null;
        str.length();
        System.out.println("method1 ended");
    }
}

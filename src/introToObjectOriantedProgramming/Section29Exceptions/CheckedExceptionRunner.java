package introToObjectOriantedProgramming.Section29Exceptions;

public class CheckedExceptionRunner {
    public static void main(String[] args) {
//         try {
//             someOtherMethod();
//             Thread.sleep(2000);
//         }catch (InterruptedException ex){
//             System.out.println("InterruptedException hit");
//             ex.printStackTrace();
//         }
        someOtherMethod2();
    }

    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }
    private static void someOtherMethod2() throws RuntimeException{

    }
}

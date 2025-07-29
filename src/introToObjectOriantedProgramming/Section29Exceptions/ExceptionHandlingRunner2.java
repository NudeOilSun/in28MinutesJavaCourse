package introToObjectOriantedProgramming.Section29Exceptions;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }

    private static void method1() {
        try {
            //String str = null;
            //str.length();
            int[] i = {1,2};
            int i1 = i[2];
            System.out.println("method1 ended");
        } catch (NullPointerException ex){
            System.out.println("null pointer exception hit");
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException exception hit");
            ex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("exception hit");
            ex.printStackTrace();
        };
    }
}

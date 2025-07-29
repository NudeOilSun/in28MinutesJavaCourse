package introToObjectOriantedProgramming.Section29Exceptions;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int[] numbers = {1, 2, 3, 4};
            int number = numbers[4];

            scanner.close();

        } catch(Exception ex){
            ex.printStackTrace();
        } finally {

            System.out.println("before scanner close");
            if (scanner != null) scanner.close();
        }

        System.out.println("closing main");

    }
}

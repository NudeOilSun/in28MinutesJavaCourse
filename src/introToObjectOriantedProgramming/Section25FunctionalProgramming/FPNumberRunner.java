package introToObjectOriantedProgramming.Section25FunctionalProgramming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,5,6,8);

        numbers.stream().forEach(n -> System.out.println(n));

        int sum = getSum(numbers);
        System.out.println(sum);

        int oddSum = getOddSum(numbers);
        System.out.println(oddSum);

    }

    private static int getOddSum(List<Integer> numbers) {
        int oddSum = numbers.stream()
                .filter(s -> s % 2 != 0)
                .reduce(0, (number1, number2) -> number1 + number2);
        return oddSum;
    }

    private static int getSum(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
        return sum;
    }
}

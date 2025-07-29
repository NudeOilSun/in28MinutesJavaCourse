package introToObjectOriantedProgramming.Section25FunctionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic {
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {

        return numbers.stream().filter(n -> n%2!=0).collect(Collectors.toList());

    }

    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (n == 0) return  List.of();

        return IntStream.range(1,n + 1)
                .map(e -> e * e * e)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null || courses.isEmpty()) return List.of();

        return courses.stream().map(String::length).collect(Collectors.toList());
    }

    public static long sumOfSquares(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) return 0;

        return numbers.stream().mapToLong(n -> n*n).sum();

    }

    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        Optional<Integer> maxEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .max(Integer::compare);

        return maxEven.orElse(0);

    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 45, 67, 12, 34, 56, 78);
        int maxEven = findMaxEvenNumber(numbers);
        System.out.println("Max even number: " + maxEven);
    }
}


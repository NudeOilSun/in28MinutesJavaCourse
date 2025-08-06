package introToObjectOriantedProgramming.Sec34NewJavaFeatures.c;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateNotRunner {

    public static boolean IsEven(Integer number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        Predicate<Integer> evenNumberPredicate  = number -> number % 2 == 0;

        numbers.stream()
                .filter(evenNumberPredicate)
                .forEach(System.out::println);

        numbers.stream()
                .filter(evenNumberPredicate.negate()) //.negate filters out this crietria rather than in e.g. odd numbers
                .forEach(System.out::println);

        numbers.stream()
                .filter(PredicateNotRunner::IsEven)
                .forEach(System.out::println);

        numbers.stream()
                .filter(Predicate.not(PredicateNotRunner::IsEven))
                .forEach(System.out::println);

    }
}

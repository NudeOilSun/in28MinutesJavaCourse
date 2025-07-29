package introToObjectOriantedProgramming.Section25FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15,4,5,6,7,10);

        //print square of the first 10 numbers
        IntStream.range(1,11 ).map(e -> e*e).forEach(p -> System.out.println(p));
        var squaredList = IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList());
        System.out.println(squaredList);

        //Map to lower case and print them
        List.of("Apple", "Pears", "Bananas").stream().map(l -> l.toLowerCase()).forEach(p -> System.out.println(p));

        //terminal functions print even numbers
        var result = List.of(4,6,8,13,3,15,4,5,6,7,10).stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}

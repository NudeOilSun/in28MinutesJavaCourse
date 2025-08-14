package introToObjectOriantedProgramming.Sec34NewJavaFeatures.m;

import java.util.stream.Gatherers;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGatherRunner {

    private static void Fold(){
        Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();

        numbers.gather(Gatherers.fold(() -> 0, (sum, i) -> sum+i))
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        Fold();
    }
}

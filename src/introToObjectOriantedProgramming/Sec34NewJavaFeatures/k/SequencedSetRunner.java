package introToObjectOriantedProgramming.Sec34NewJavaFeatures.k;

import java.util.LinkedHashSet;
import java.util.List;

public class SequencedSetRunner {
    public static void main(String[] args) {
        var courses = List.of("Spring", "Sprint boot", "aws", "azure"); //Mutable list, so can not change
        var coursesHashSet = new LinkedHashSet<>(courses); //Create linkedHashSet so we can add things
        //LinkedHashSet does not allow duplicates

        System.out.println("First Element: " + coursesHashSet.getFirst());
        System.out.println("Last Element: " + coursesHashSet.getLast());
        System.out.println("Order: " + coursesHashSet);

        System.out.println("Adding new elements");
        coursesHashSet.addFirst("Sprint Security");
        coursesHashSet.addLast("Sprint AI");

        System.out.println("Order: " + coursesHashSet);
        System.out.println("Reversed: " + coursesHashSet.reversed());
    }
}

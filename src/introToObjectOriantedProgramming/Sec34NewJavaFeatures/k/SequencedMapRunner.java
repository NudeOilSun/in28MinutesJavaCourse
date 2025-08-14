package introToObjectOriantedProgramming.Sec34NewJavaFeatures.k;

import java.util.LinkedHashMap;

public class SequencedMapRunner {
    public static void main(String[] args) {
        var courseDetails = new LinkedHashMap<>();
        courseDetails.put(1, "Spring");
        courseDetails.put(2, "Spring boot");
        courseDetails.put(3, "Spring AI");
        System.out.println("Map:" + courseDetails);

        System.out.println("Adding elements...");
        courseDetails.putFirst(10, "Sprint security");
        courseDetails.putLast(20, "Sprint cloud");

        System.out.println("Map: " + courseDetails);

        System.out.println("sequencedKeySet: " + courseDetails.sequencedKeySet());
        System.out.println("sequencedValues: " + courseDetails.sequencedValues());
        System.out.println("sequencedEntrySet: " + courseDetails.entrySet());
        System.out.println("First Entry: " + courseDetails.firstEntry());
        System.out.println("Last Entry: " + courseDetails.lastEntry());


        System.out.println("First Poll Entry: " + courseDetails.pollFirstEntry());
        System.out.println("Map: " + courseDetails);

        System.out.println("Last Poll Entry: " + courseDetails.pollLastEntry());
        System.out.println("Map: " + courseDetails);

        System.out.println("Reversed: " + courseDetails.reversed());



    }
}

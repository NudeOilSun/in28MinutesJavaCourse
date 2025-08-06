package introToObjectOriantedProgramming.Sec34NewJavaFeatures.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfAPIRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Louise");
        names.add("Pepsi");
        names.add("Xeno");
        names.add("Kyle");

        List<String> unchangesNames = List.copyOf(names);

        doNotChangeNames(names);
        doNotChangeNames(unchangesNames);

        System.out.println("names: "+names);
        System.out.println("unchanged Names: " + unchangesNames);
    }

    private static void doNotChangeNames(List<String> names) {
        names.add("not Allowed");
    }
}

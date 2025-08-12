package introToObjectOriantedProgramming.Sec34NewJavaFeatures.e;

import java.util.List;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> listOfNames1 = List.of("Louise", "Kyle");
        List<String> listOfNames2 = List.of("Pepsi", "Xeno");
        //List<List<String>> listoflists = List.of(listOfNames1, listOfNames2);
        var listoflists = List.of(listOfNames1, listOfNames2);
    }
}

package introToObjectOriantedProgramming.Section22Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. This has never happened before";

        Map<Character, Integer> occurances = new HashMap<>();

        char[]  characaters = str.toCharArray();

        for (char i:characaters){
            Integer intergrer = occurances.get(i);
            if (intergrer == null){
                occurances.put(i, 1);
            }
            else {
                occurances.put(i, intergrer + 1 );
            }
        }

        System.out.println(occurances);

        TreeMap<String,Integer> treemap = new TreeMap<>();
        treemap.put("F", 25);
        treemap.put("Z", 50);
        treemap.put("L", 250);
        treemap.put("A", 15);
        treemap.put("B ", 25);
        treemap.put("G ", 25);
    }
}

package introToObjectOriantedProgramming.Section22Collections;

import java.util.*;

public class ListExercise {

    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        Set<Character> hash =  new HashSet<>(characters);
        Set<Character> LinkedhashSet =  new LinkedHashSet<>(characters);
        Set<Character> tree =  new TreeSet<>(characters);

        System.out.println("HasSet" + hash);
        System.out.println("LinkedhashSet" + LinkedhashSet);
        System.out.println("tree" + tree);
    }
}

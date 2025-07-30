package introToObjectOriantedProgramming.Section30Concurrency;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

        String str = "ABCD ABCD ABCD";

        for(char c: str.toCharArray()){
            occurances.computeIfAbsent(c, ch -> new LongAdder()).increment();
        }

        System.out.println(occurances);
    }
}

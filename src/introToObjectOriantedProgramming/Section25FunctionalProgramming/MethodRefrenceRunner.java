package introToObjectOriantedProgramming.Section25FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodRefrenceRunner {
    public static void Print(Integer number){
        System.out.println(number);
    }

    public static Boolean isEven(Integer number){
        return number % 2 ==0;
    }


    public static void main(String[] args) {
        List.of("Ant","Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        List.of("Ant","Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length)
                .forEach(MethodRefrenceRunner::Print);

        //Returns biggest even number
        Integer max = List.of(23,45,67,34).stream()
                .filter(getIntegerPredicate())
                .max((n1,n2)-> Integer.compare(n1,n1))
                .orElse(0);

        System.out.println(max);

        //passing fucntions into methods
        Integer otherMax = List.of(23,45,67,34).stream()
                .filter(MethodRefrenceRunner::isEven)
                .max(Integer::compare)
                .orElse(0);

        System.out.println(otherMax);

        Predicate<Integer> integerPredicate = getIntegerPredicate();         //returning functions from method
        Predicate<Integer> oddIntegerPredicate = n -> n % 2 != 0;         //storing fucntions as variables

        Integer otherMaxAgain = List.of(23,45,67,34).stream()
                .filter(integerPredicate)
                .max((n1,n2)-> Integer.compare(n1,n1))
                .orElse(0);

        System.out.println(otherMaxAgain);


    }

    private static Predicate<Integer> getIntegerPredicate() {
        return n -> n % 2 == 0;
    }
}

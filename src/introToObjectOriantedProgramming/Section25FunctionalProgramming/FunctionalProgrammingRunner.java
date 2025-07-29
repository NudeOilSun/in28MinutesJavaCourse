package introToObjectOriantedProgramming.Section25FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

        //PrintBasic(list);
        //PrintBasicwithFp(list);
        PrintBasicWithFiltering(list);
        PrintBasicwithFpWithFiltering(list);

        List<Integer> numberList = List.of(1,2,3,4);
        //PrintBasicwithFpNumbers(numberList);
        PrintBasicwithFpNumbersOnlyOdd(numberList);
        PrintBasicwithFpNumbersOnlyEven(numberList);
    }

    private static void PrintBasic(List<String> list) {
        for(String item: list){
            System.out.println(item);
        }
    }

    private static void PrintBasicWithFiltering(List<String> list) {
        for(String item: list){
            if (item.endsWith("at")){
                System.out.println(item);
            }
        }
    }
    private static void PrintBasicwithFp(List<String> list) {
        list.stream().forEach(l -> System.out.println(l));
    }

    private static void PrintBasicwithFpWithFiltering(List<String> list) {
        list.stream()
                .filter(l -> l.endsWith("at"))
                .forEach(l -> System.out.println(l));
    }

    private static void PrintBasicwithFpNumbers(List<Integer> list) {
        list.stream().forEach(l -> System.out.println(l));
    }

    private static void PrintBasicwithFpNumbersOnlyOdd(List<Integer> list) {
        list.stream()
                .filter(l -> l % 2 != 0).forEach(l -> System.out.println("Odd -" + l));
    }

    private static void PrintBasicwithFpNumbersOnlyEven(List<Integer> list) {
        list.stream()
                .filter(l -> l % 2 == 0).forEach(l -> System.out.println("Even -" + l));
    }


}

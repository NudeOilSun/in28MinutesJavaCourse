package introToObjectOriantedProgramming.Sec34NewJavaFeatures.d;

public class StringNewApiRunner {
    public static void main(String[] args) {
        System.out.println("".isBlank()); //bool check, same as String.isnullorempty in .net

        System.out.println(" LR ".strip()); //same as .trim
        System.out.println(" LR ".stripLeading());
        System.out.println(" LR ".stripTrailing());

        System.out.println(" LR ".strip().replace(" ", "@"));
        System.out.println(" LR ".stripLeading().replace(" ", "@"));
        System.out.println(" LR ".stripTrailing().replace(" ", "@"));

        System.out.println("Line1\nLine2\nLine3\n".lines());
        "Line1\nLine2\nLine3\n".lines().forEach(System.out::println);

        System.out.println("UPPER".substring(2));
        System.out.println("My name is %s. My ages is %d".formatted("Louise", 29));
    }
}

package introToObjectOriantedProgramming.Sec34NewJavaFeatures.h;

public class RecordsRunner {
    record Person(String name, String email, String phone){};

    public static void main(String[] args) {
        Person personA = new Person("Louise", "myEmail.com", "09999");
        Person personB = new Person("Louise", "myEmail.com", "09999");
        Person personC = new Person("Louise", "myEmail.com", "09999");

        System.out.println(personA);

        System.out.println(personA.name.equals("Kyle"));
        System.out.println(personA.name.equals("Louise"));
    }
}

package introToObjectOriantedProgramming.Section22Collections;

import java.util.*;

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Louise"),
                new Student(3, "Pepsi"),
                new Student(2, "Xeno")
        );

        ArrayList<Student> studental = new ArrayList<>(students);

        System.out.println(studental);
        Collections.sort(studental);
        System.out.println(studental);

        Collections.sort(studental, new AscendingStudentCompartor());
        System.out.println("AscendingStudentCompartor - " + studental);

        Collections.sort(studental, new DecendingStudentCompartor());
        System.out.println("DecendingStudentCompartor - " + studental);

        Collections.sort(studental, new NameStudentCompartor());
        System.out.println("StringStudentCompartor - " + studental);

    }


}

class AscendingStudentCompartor implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}
class DecendingStudentCompartor implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

class NameStudentCompartor implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

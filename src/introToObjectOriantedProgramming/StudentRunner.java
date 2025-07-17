package introToObjectOriantedProgramming;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Louise", new int[]{98,99,100});

        System.out.println("number of marks - "+ student.getNumberofMarks());
        System.out.println("number of sum marks - "+ student.getTotalSumOfMarks());
        System.out.println("max - "+ student.getMaxiumMark());
        System.out.println("min - "+ student.getMinMark());
        System.out.println("average - "+ student.getAverage());
    }
}

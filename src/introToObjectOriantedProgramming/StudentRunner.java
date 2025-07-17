package introToObjectOriantedProgramming;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {98,99,100};
        Student student = new Student("Louise", marks );

        System.out.println("number of marks - "+ student.getNumberofMarks());
        System.out.println("number of sum marks - "+ student.getTotalSumOfMarks());
        System.out.println("max - "+ student.getMaxiumMark());
        System.out.println("min - "+ student.getMinMark());
        System.out.println("average - "+ student.getAverage());
    }
}

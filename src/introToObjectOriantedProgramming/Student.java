package introToObjectOriantedProgramming;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Student {
    String name;
    int[] marks;

    Student(String name, int... marks){
        this.name = name;
        this.marks = marks;
    }

    int getNumberofMarks(){
        return marks.length;
    }

    int getTotalSumOfMarks(){
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }

        return sum;
    }

    int getMaxiumMark(){
        int max = 0;
        for (int mark:marks) {
            if (mark > max) {
                max = mark;
            }

        }
        return max;
    }

    int getMinMark(){
        int min = Integer.MAX_VALUE;
        for (int mark:marks) {

            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    BigDecimal getAverage(){
        int sum = getTotalSumOfMarks();
        int numberOfMarks = getNumberofMarks();
        return new BigDecimal(sum/numberOfMarks);
    }

}

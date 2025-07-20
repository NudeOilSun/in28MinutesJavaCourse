import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMagic {

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {


        if (array.length <= 1) return true;

        for(int i = 1; i < array.length; i++){
            if (array[i] < array[i-1]) return false;

        }

        return true;
    }

    public int[] reverseArray(int[] array) {
        if (array.length <= 1) return array;

        int[] reversedArray = new int[array.length];
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }

        return reversedArray;
    }

    public List<Integer> determineAllFactors(int number) {
        List<Integer> factors = new ArrayList<>();

        if (number < 1) return factors;

        for(int i = 1; i <= number; i++){
            if (number % i == 0){
                factors.add(i);
            }
        }

        return factors;
    }

    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> multiples = new ArrayList<>();

        if (number <= 0 || limit <= 0) return multiples;

        for(int i = 1; i * number < limit; i++){
            multiples.add(i*number);

        }

        return multiples;
    }
}
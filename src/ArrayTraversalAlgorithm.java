import java.util.Arrays;

//Array is a collection of items of the same variable type that are stored at contiguous memory locations.
// It is one of the most popular and simple data structures used in programming.
public class ArrayTraversalAlgorithm {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");//traversing and printing
        }
        System.out.println();
        System.out.println(Arrays.toString(array));//normally printing the array values
    }
}

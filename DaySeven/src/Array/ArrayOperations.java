package Array;

public class ArrayOperations {

    // Print int array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    // Sum of variable number of integers
    public static int getSum(int... n) {
        int sum = 0;
        for (int no : n) {
            sum += no;
        }
        return sum;
    }

    // Count number of odd elements in an array
    public static int getOddCount(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0)
                count++;
        }
        return count;
    }

}

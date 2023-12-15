package sortingActivity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Arrays.toString(nums)
        Sorting test = new Sorting();
        int[] arr = test.getArray();
        System.out.println(Arrays.toString(arr));
        int[] sorted = test.sortArray(arr);
        System.out.println(Arrays.toString(sorted));


    }
}

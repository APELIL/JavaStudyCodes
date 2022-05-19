package Array;

import java.util.Arrays;

public class ArrayClass01 {
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        //1. using class Arrays.toString() to print element
        System.out.println(Arrays.toString(nums));
        //2. using class Arrays.sort() to sort elements
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //3. using class Arrays.fill() to fill value
        int[] a = new int[3];
        Arrays.fill(a,3);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 1,3,0);
    }
}

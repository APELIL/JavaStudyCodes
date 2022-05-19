package Array;

public class Demo01 {
    public static void main(String[] args) {
        int[] nums;//1. declare an array
        nums = new int[3];//2. create an array
        nums[0] = 1; //3. assign a value
        nums[1] = 2;
        nums[2] = 3;
        // 1. Array in for each
        for (int num : nums) {
            System.out.println(num);
        }
        // 2. invert an array
        int[] invert = new int[nums.length];
        for (int i = 0,j = invert.length-1; i < nums.length;i++,j--) {
            invert[i] = nums[j];
        }
        System.out.println(invert);
    }
}

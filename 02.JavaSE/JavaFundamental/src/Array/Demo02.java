package Array;

public class Demo02 {
    public static void main(String[] args) {
        int[] nums;//1. declare an array
        nums = new int[3];//2. create an array
        nums[0] = 1; //3. assign a value
        nums[1] = 2;
        nums[2] = 3;
        // call function to print an array
        printArray(nums);
        // call function to invert an array
        int[] result = invert(nums);
        printArray(result);
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] invert(int[] array){
        int[] invert = new int[array.length];
        for (int i = 0,j = invert.length-1; i < array.length;i++,j--) {
            invert[i] = array[j];
        }
        return invert;
    }
}

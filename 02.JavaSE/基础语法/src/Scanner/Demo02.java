package Scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter");
        if (in.hasNext()){
            String out = in.nextLine();
            System.out.println("Output:"+out);
        }
    }
}

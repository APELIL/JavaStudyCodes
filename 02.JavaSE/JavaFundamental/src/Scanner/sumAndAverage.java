package Scanner;

import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args) {
        System.out.println("PLZ enter a valid number:");
        Scanner in = new Scanner(System.in);
        double s = 0.0;
        int times = 0;
        while (in.hasNextDouble()){
            double num = in.nextDouble();
            ++times;
            s = s + num;
        }
        System.out.println("sum:"+s);
        System.out.println("avg:"+(s/times));
        in.close();
    }
}

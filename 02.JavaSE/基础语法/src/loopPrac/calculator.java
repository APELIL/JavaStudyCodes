package loopPrac;
import java.util.Scanner;

public class calculator {
//int result;
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String o = "";
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number1:");
        if (scanner.hasNext()) {
            a = scanner.nextInt();
            System.out.println("Number2:");
            b = scanner.nextInt();
            System.out.println("Operator:");
            o = scanner.next();
        }
        switch (o) {
            case "+":
                result = a + b;
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "and":
                System.out.println("Happiness");
                o = "invalid";
                break;
            default:
                System.out.println("plz enter a valid operator e.g.,+,-,*,/");
                o = "invalid";
                break;
        }
        if (o != "invalid") {
            System.out.printf("result:%d%n", result);
        }
    }
}

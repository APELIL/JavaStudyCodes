package Scanner;

import java.util.Scanner;

public class next_nl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String in = scanner.nextLine();
        String in = scanner.next();
        System.out.println("you entered:"+in);
        scanner.close();
    }
}

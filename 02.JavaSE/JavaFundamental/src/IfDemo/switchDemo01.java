package IfDemo;

import java.util.Scanner;

public class switchDemo01 {
    public static void main(String[] args) {
        String name = "lilape";
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        switch (in) {
            case "lilape":
                System.out.println("LILAPE");
                break;
        }
    }

}

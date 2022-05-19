package loopPrac;
// you can think like this way, 1st row got 1 col, 2nd row 2 col, and so on. There are 9 rows in total, so the outter loop
//should be loop times equals to 9, and the inner loop maximum times should be depends j of the outter loop
public class table99 {
//    public static void main(String[] args) {
//        for (int j = 1; j <= 9; j++) {
//            for (int i = 1; i <= j; i++){
//                System.out.print(i+"*"+j+"="+(j*i)+"\t");
//            }
//            System.out.println();
//        }
//    }
public static void main(String[] args) {
    for (int j = 1; j <= 9; j++) {
        for (int i = 1; i <= j; i++) {
            System.out.print("*"+"\t");
        }
        System.out.println();

    }
}
}

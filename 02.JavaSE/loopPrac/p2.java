package loopPrac;
// Question: find out the number between 1 and 1000 that are divisible by 5, and print three divisble number per line
public class p2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i%5==0&&i!=0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println();
            }

        }
    }
}

package loop;

public class break_continue {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if(i%10==0) {
                System.out.println();
//                break;//end the while loop
                continue;//jump out if statement
            }
            System.out.print(i+"\t");
        }
    }
}

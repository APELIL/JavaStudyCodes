package loopPrac;
//Question: Calculate the sum of odd and even numbers between 0 and 100
public class p1 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        System.out.println("odd:"+odd);
        System.out.println("even:"+even);
    }
}

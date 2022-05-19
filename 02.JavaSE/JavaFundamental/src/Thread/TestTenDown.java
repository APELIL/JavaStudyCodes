package Thread;

public class TestTenDown{
    public static void main(String[] args) throws InterruptedException {
        tenDown();
    }

    public static void tenDown() throws InterruptedException {
        int num = 10;
        while(true){
            System.out.println(""+num--);
            Thread.sleep(1000);
            if (num<=0){
//                System.exit(0);
                break;
            }
        }
    }
}

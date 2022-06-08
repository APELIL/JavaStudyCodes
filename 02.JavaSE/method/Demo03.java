package method;

public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        demo03.test(1,3,4,5);
    }
    public void test(int...a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]/2);
        }

    }
}

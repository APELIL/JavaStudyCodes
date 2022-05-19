package recursive;

public class factorial {
    public static void main(String[] args) {
        int result = fac(10);
        System.out.println(result);
    }
    public static int fac(int n){
        if(n==1){//recursive header
            return 1;
        }else {//recursive body
            return n*fac(n-1);
        }
    }
}

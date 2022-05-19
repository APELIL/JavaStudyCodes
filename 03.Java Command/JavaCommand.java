import java.util.Arrays;

public class JavaCommand {

public static void main(String[] args){
    for (int i = 0; i < args.length; i++) {
        if (args[i] == "Mike"){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        System.out.println(args[i]);
    }

}

}




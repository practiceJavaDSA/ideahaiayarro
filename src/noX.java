import java.util.Scanner;

public class noX {
    static String NoX(String s){

        if(s.length() == 0){
            return "";
        }

        String recAns = NoX(s.substring(1));

        if(s.charAt(0) == 'x'){
            return recAns;
        }
        else{
            return s.charAt(0) + recAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(NoX(s));
    }
}

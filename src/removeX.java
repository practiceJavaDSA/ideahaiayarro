import java.util.Scanner;

public class removeX {
    static String noX(String s){
        if (s.isEmpty()){
            return "";
        }
        String recAns = noX(s.substring(1));
        if(s.charAt(0)=='x'){
            return recAns;
        }
        else {
            return s.charAt(0)+recAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(noX(str));
    }
}

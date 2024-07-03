import java.util.Scanner;

public class countXinString {
    static int countX(String str){
        //base case
        if(str.isEmpty()){
            return 0;
        }

        //recCall
        int recAns = countX(str.substring(1));
        //myAns
        if(str.charAt(0)=='x'){
            return 1+recAns;
        }
        else{
            return recAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int n = str.length();
        int ans = countX(str);
        System.out.println(ans);
    }
}

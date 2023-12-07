import java.util.*;
public class SumOfNNumbers {
    static int addition(int n){
        //base case
        if(n == 1){
            return 1;
        }
        //int recAns = addition(n-1);
        //int myAns = recAns + n;
        return n + addition(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = addition(n);
        System.out.println(ans);
    }
}

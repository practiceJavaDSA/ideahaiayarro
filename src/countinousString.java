import java.util.Scanner;

public class countinousString {
    static void solve(int n){
        //base case
        if (n == 0){
            return;
        }
        System.out.println("Captain");
        solve(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        solve(n);
    }
}

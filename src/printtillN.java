import java.util.Scanner;

public class printtillN {
    static void printtillNNN(int n){
        if (n == 0){
            return;
        }
        printtillNNN(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        printtillNNN(n);
    }
}

import java.util.Scanner;

public class fibnocii {
    static int fibo(int n){
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}

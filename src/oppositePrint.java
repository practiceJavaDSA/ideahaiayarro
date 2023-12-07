import java.util.Scanner;

public class oppositePrint {
    static void oppo(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        oppo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        oppo(n);
    }
}

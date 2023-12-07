import java.util.Scanner;

public class multiply {
    static int multi(int n){
        if(n == 1){
            return 1;
        }
        return n * multi(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(multi(n));
    }
}

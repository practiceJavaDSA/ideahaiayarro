import java.util.Scanner;

public class printIncreaseDecrease {
    static void printDI(int n){
        //Base case
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        printDI(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        printDI(n);
    }
}

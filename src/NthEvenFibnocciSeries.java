import java.util.Scanner;

public class NthEvenFibnocciSeries {
    public static int EvenFibnocci(int n){
        if(n == 0){
            return n;
        }
        if(n == 1){
            return 2;
        }
        return (4*EvenFibnocci(n-1)+EvenFibnocci(n-2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(EvenFibnocci(n));
    }
}

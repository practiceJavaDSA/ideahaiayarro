import java.util.Scanner;

public class powerCalculation {
    public static long power(long x, long y){
        if(y == 0){
            return 1;
        }
        long recAns = power(x, y-1);
        long myAns = x * recAns;
        return myAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(power(n,m));
    }
}

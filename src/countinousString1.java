import java.util.Scanner;

public class countinousString1 {
    static void solution(int i, int n){
        //Base case
        if( i == n){
            return;
        }
        System.out.println("Captain");
        solution(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        solution(0,n);
    }
}

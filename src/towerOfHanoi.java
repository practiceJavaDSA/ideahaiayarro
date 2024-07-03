import java.util.Scanner;

public class towerOfHanoi {
    public static void Hanoi(int n, String from, String to, String via){
        if(n == 1){
            System.out.println("Move Disk 1 from "+from+ " to "+to);
        }
        else {
            Hanoi(n-1,from,via,to);
            System.out.println("Move Disk "+n+" from "+from+" to "+to);
            Hanoi(n-1,via,to,from);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
//        String from = "A";
//        String to = "B";
//        String via = "C";
        Hanoi(n, "A", "C", "B");
    }
}


import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit ");
        int n = scan.nextInt();
        outer:
        for (int i = 10; i > n; i--) {
            System.out.println("i= " + i);
            for (int j = 10; j > n; j--) {
                System.out.println("j= " +j);
                if (j == 8)
                    break outer;
            }
        }
    }
}
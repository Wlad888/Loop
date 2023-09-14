
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int[] array = new int[50];
        int k = 0;
        for (int s = 0; s < 100; s++)
            if (s % 2 == 1) {
                array[k] = s;
                k++;

            }
        for (int s = 0; s < k; s++) {
            System.out.println(array[s]);


        }
    }

}
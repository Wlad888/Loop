import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int numberOfRepeat = 0;
        System.out.println("Enter the name of your girl: ");
        String name= console.nextLine();
        String continuation = " Loves me very much";
      while (numberOfRepeat < 10) {
          System.out.println(name + continuation);
          numberOfRepeat++;
      }
    }
}
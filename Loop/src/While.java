public class While {
    public static void main(String[] args) {
        int a = 0;
        while (a < 6) {
            int b = 0;
            while (b < 5) {
                System.out.print("A");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}

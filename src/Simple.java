import java.util.Scanner;

public class Simple {
    public static void main(String[] p) {
        Scanner u = new Scanner(System.in);
        if (u.hasNextInt()) {
            int k = u.nextInt();
            while (k-- > 0) {
                int n = u.nextInt();
                for (int i = n; i > 0; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
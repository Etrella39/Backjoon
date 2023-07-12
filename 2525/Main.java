import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b + c < 60) {
            b = b + c;
        } else {
            b = b + c;

            while (b >= 60) {
                b = b - 60;
                a += 1;
            }

            while (a >= 24)
                a = a - 24;

        }
        System.out.print(a + " " + b);
    }
}

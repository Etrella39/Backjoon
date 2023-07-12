import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int z = sc.nextInt();
        int b = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == z)
                b++;
        }
        System.out.println(b);
    }
}
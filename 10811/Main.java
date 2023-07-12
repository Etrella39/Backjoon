import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];
        for (int a = 1; a <= n; a++)
            arr[a] = a;

        for (int a = 0; a < m; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            while (i < j) {
                int tmp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tmp;
            }
        }

        for (int a = 1; a <= n; a++) {
            System.out.print(arr[a] + " ");
        }
        sc.close();
    }
}
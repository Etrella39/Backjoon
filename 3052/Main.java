import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            arr[a % 42] = 1;
        }

        int tmp = 0;
        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1)
                tmp++;
        }
        System.out.println(tmp);
    }
}
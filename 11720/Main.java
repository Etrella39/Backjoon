import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String numbers = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Character.getNumericValue(numbers.charAt(i));
            sum += num;
        }

        System.out.println(sum);
        sc.close();
    }
}

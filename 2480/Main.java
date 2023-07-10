import java.util.*;

class Main {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int money;

        if (a == b && a == c) {
            money = 10000 + 1000 * a;
        } else if (a == b || a == c || b == c) {
            if (a == b)
                money = 1000 + 100 * a;
            else if (a == c)
                money = 1000 + 100 * c;
            else
                money = 1000 + 100 * b;
        } else {
            if (a > b) {
                if (c > a)
                    money = 100 * c;
                else
                    money = 100 * a;
            } else if (c > b)
                money = 100 * c;
            else
                money = 100 * b;
        }
        System.out.println(money);
    }

}
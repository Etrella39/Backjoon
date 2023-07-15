import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < 26; i++) {
            int a = 97;
            a = (char) (a + i);
            int index = str.indexOf(a);
            System.out.print(index + " ");
        }

        sc.close();
    }
}

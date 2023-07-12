import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] score = new double[n];
        for (int i = 0; i < n; i++)
            score[i] = sc.nextDouble();

        double max = score[0];
        for (int i = 1; i < n; i++)
            if (score[i] > max)
                max = score[i];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = score[i] / max * 100;
            sum += score[i];
        }
        System.out.println(sum / n);
    }
}
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                int sum = a + b;
                bw.write(String.valueOf(sum));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
        }
    }
}

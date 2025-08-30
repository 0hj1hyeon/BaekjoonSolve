import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        final int MOD = 15746;

        if (N == 1) {
            System.out.println(1);
            return;
        }
        if (N == 2) {
            System.out.println(2);
            return;
        }

    
        int a = 1; // dp[1]
        int b = 2; // dp[2]
        int result = 0;

        for (int i = 3; i <= N; i++) {
            result = (a + b) % MOD; // dp[i] = dp[i-1] + dp[i-2]
            a = b;
            b = result;
        }

        System.out.println(result);
    }
}

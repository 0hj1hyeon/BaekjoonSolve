import java.io.*;
import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 카드 개수
        int[] a = new int[N + 1]; // 가격 배열 (1-indexed)
        int[] dp = new int[N + 1]; // dp[i] = 카드 i개를 구매할 때 최대 금액

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + a[j]);
            }
        }

        System.out.println(dp[N]);
    }
}
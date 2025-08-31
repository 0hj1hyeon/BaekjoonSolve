import java.io.*;
import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N + 1];
        int[] dp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }


        dp[1] = 1;
        int ans = dp[1];

        for(int i=2 ; i<=N; i++){
            dp[i] =1;
            for(int j =1; j<=i; j++){
                if(score[i]>score[j]&&dp[j]+1>dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
            ans = Math.max(dp[i], ans);
        }

        System.out.println(ans);

    }

}
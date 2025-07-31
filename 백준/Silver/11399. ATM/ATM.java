import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(time);

        int total = 0; // 총 시간
        int sum = 0;   // 각 사람의 대기시간 누적합

        for (int i = 0; i < n; i++) {
            sum += time[i];     
            total += sum;      
        }

        System.out.println(total);
    }
}
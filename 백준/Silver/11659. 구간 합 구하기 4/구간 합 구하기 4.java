import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long[] arr = new long[a+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=a; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1]+num;
        }

        for (int i =0; i<b; i++) {
            st = new StringTokenizer(br.readLine());
            int start =Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            long result =arr[end] - arr[start-1];
            bw.write(result+ "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
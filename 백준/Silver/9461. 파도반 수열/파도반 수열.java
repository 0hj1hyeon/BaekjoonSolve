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
        int T = Integer.parseInt(br.readLine());

        long[]  tr = new long[101];
        tr[1] = 1;
        tr[2] = 1;
        tr[3] = 1;
        tr[4] = 2;
        tr[5] = 2;

        for(int i =6 ; i<=100; i++){
            tr[i]= tr[i-1] + tr[i-5];
        }

        for (int a =0; a<T; a++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(tr[n]+ "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
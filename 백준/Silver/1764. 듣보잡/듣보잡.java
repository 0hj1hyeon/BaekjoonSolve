import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Set<String> s = new HashSet<>();

        for (int i = 0; i < M; i++) {
            s.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String nsname = br.readLine();
            if(s.contains(nsname)){
                result.add(nsname);
            }
        }
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for (String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
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
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        for (int a =0; a<T; a++) {
            int n = Integer.parseInt(br.readLine()); // 해빈이가 가진 옷의 수
            Map<String, Integer> clothesMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); 
                String type = st.nextToken(); 


                clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
            }

            long result = 1;


            for (int count : clothesMap.values()) {
                result *= (count + 1);
            }

            
            bw.write((result - 1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
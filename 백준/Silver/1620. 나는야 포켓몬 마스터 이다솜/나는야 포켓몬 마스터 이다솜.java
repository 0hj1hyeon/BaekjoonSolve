import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1. 이름 -> 번호 해시맵
        HashMap<String, Integer> nameMap = new HashMap<>();
        // 2. 번호 -> 이름 해시맵
        HashMap<Integer, String> numberMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameMap.put(name, i);
            numberMap.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String query = br.readLine();

            // 숫자인지 문자인지 구분
            try {
                // 숫자인 경우 (번호로 이름 찾기)
                int number = Integer.parseInt(query);
                bw.write(numberMap.get(number) + "\n");
            } catch (NumberFormatException e) {
                // 문자인 경우 (이름으로 번호 찾기)
                bw.write(nameMap.get(query) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
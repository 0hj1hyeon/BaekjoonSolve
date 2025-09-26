import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        int bitmask = 0; // 집합 S를 나타내는 비트마스크 변수

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            int x = 0;
            // "all"과 "empty"는 숫자가 필요 없으므로 다음 토큰이 있는지 확인
            if (!operation.equals("all") && !operation.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (operation) {
                case "add":
                    // x-1번째 비트를 1로 설정 (OR 연산)
                    bitmask |= (1 << (x - 1));
                    break;
                case "remove":
                    // x-1번째 비트를 0으로 설정 (AND 연산과 NOT 연산)
                    bitmask &= ~(1 << (x - 1));
                    break;
                case "check":
                    // x-1번째 비트가 켜져 있는지 확인
                    if ((bitmask & (1 << (x - 1))) != 0) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "toggle":
                    // x-1번째 비트의 상태를 반전 (XOR 연산)
                    bitmask ^= (1 << (x - 1));
                    break;
                case "all":
                    // 1부터 20까지 모든 비트를 1로 설정
                    bitmask = (1 << 20) - 1;
                    break;
                case "empty":
                    // 모든 비트를 0으로 설정
                    bitmask = 0;
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
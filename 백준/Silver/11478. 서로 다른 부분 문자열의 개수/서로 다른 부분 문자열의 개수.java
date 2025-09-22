import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Set<String> subStrings = new HashSet<>();
        int n = s.length();

        // 모든 부분 문자열을 생성하여 Set에 추가
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                subStrings.add(s.substring(i, j));
            }
        }

        // Set의 크기를 출력 (중복이 제거된 개수)
        System.out.println(subStrings.size());
    }
}
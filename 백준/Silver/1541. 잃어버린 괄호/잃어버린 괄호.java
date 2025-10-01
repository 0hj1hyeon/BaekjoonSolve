import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        // '-'를 기준으로 식을 분리
        String[] subtractionParts = expression.split("-");

        int result = 0;

        // 첫 번째 덩어리 계산 (첫 '-' 앞)
        // 이 부분은 모두 덧셈이므로 그냥 더합니다.
        StringTokenizer st1 = new StringTokenizer(subtractionParts[0], "+");
        while (st1.hasMoreTokens()) {
            result += Integer.parseInt(st1.nextToken());
        }

        // 두 번째 덩어리부터는 모두 뺌
        // 각 덩어리 내부의 숫자들을 모두 더한 후, 결과에서 뺍니다.
        for (int i = 1; i < subtractionParts.length; i++) {
            int sumOfPart = 0;
            StringTokenizer st2 = new StringTokenizer(subtractionParts[i], "+");
            while (st2.hasMoreTokens()) {
                sumOfPart += Integer.parseInt(st2.nextToken());
            }
            result -= sumOfPart;
        }

        System.out.println(result);
        br.close();
    }
}
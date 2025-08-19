import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;  // 5, 25, 125 ... 배수 개수 더하기
        }

        System.out.println(count);
    }
}
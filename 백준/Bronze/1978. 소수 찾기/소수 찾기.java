import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 입력 개수
        int count = 0;         // 소수 개수

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }


    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
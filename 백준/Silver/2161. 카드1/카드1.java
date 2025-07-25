// BOJ 18258 - 큐 2
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) q.offer(i);

        StringBuilder sb = new StringBuilder();

        while (q.size() > 1) {

            sb.append(q.poll()).append(' ');

            q.offer(q.poll());
        }

        // 마지막 남은 카드까지 같은 줄에 붙여서 출력
        sb.append(q.poll());
        System.out.println(sb.toString());


    }
}

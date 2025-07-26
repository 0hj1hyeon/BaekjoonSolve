import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case 1: // push_front X
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2: // push_back X
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3: // pop_front
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n');
                    break;
                case 4: // pop_back
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n');
                    break;
                case 5: // size
                    sb.append(dq.size()).append('\n');
                    break;
                case 6: // empty
                    sb.append(dq.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 7: // front
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
                    break;
                case 8: // back
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}

// BOJ 18258 - 큐 2
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // O(1)로 동작하는 배열 기반 큐
    static class FastQueue {
        private final int[] data;
        private int front = 0;
        private int back = 0;

        FastQueue(int capacity) {
            data = new int[capacity];
        }

        void push(int x) {
            data[back++] = x;
        }

        int pop() {
            return empty() == 1 ? -1 : data[front++];
        }

        int size() {
            return back - front;
        }

        int empty() {
            return front == back ? 1 : 0;
        }

        int front() {
            return empty() == 1 ? -1 : data[front];
        }

        int back() {
            return empty() == 1 ? -1 : data[back - 1];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        FastQueue queue = new FastQueue(n); // 최대 n번 push가 가능하므로 n으로 충분

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.push(x);
                    break;

                case "pop":
                    sb.append(queue.pop()).append('\n');
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(queue.empty()).append('\n');
                    break;

                case "front":
                    sb.append(queue.front()).append('\n');
                    break;

                case "back":
                    sb.append(queue.back()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}

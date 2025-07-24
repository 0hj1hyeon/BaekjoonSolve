import java.io.*;
import java.util.*;

public class Main {

    static class MyStack {
        private final ArrayList<Integer> stack = new ArrayList<>();

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            if (stack.isEmpty()) return -1;
            return stack.remove(stack.size() - 1);
        }

        public int size() {
            return stack.size();
        }

        public int empty() {
            return stack.isEmpty() ? 1 : 0;
        }

        public int top() {
            if (stack.isEmpty()) return -1;
            return stack.get(stack.size() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        MyStack stack = new MyStack();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    sb.append(stack.pop()).append('\n');
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    sb.append(stack.empty()).append('\n');
                    break;
                case "top":
                    sb.append(stack.top()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}

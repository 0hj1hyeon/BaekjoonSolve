import java.io.*;

public class Main {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }

        void insert(int num) { // 전위 순회로 트리 만들기
            if (num < this.val) {
                if (this.left == null) this.left = new Node(num);
                else this.left.insert(num);
            } else {
                if (this.right == null) this.right = new Node(num);
                else this.right.insert(num);
            }
        }

        void postOrder(StringBuilder sb) { //후위 순회 출력
            if (this.left != null) this.left.postOrder(sb);
            if (this.right != null) this.right.postOrder(sb);
            sb.append(this.val).append('\n');
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Node root = null;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int num = Integer.parseInt(input);
            if (root == null) root = new Node(num);
            else root.insert(num);
        }

        StringBuilder sb = new StringBuilder();
        root.postOrder(sb);
        System.out.print(sb);
    }
}

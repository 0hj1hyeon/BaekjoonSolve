import java.io.*;
import java.util.*;

public class Main {
    static class Node {  // 노드 만들기
        char data;
        Node left;
        Node right;

        Node(char data) {
            this.data = data;
        }
    }

    static Node root;
    static Map<Character, Node> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            char parent = parts[0].charAt(0);
            char left = parts[1].charAt(0);
            char right = parts[2].charAt(0);

            Node parentNode = map.getOrDefault(parent, new Node(parent));
            map.put(parent, parentNode);

            if (i == 0) root = parentNode; // 첫 입력이 루트

            if (left != '.') {
                Node leftNode = new Node(left);
                parentNode.left = leftNode;
                map.put(left, leftNode);
            }

            if (right != '.') {
                Node rightNode = new Node(right);
                parentNode.right = rightNode;
                map.put(right, rightNode);
            }
        }

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
    }

    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data);
    }
}

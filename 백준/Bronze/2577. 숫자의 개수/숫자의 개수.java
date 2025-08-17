import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans[] = new int[10];
        int r = a*b*c;
        String s = r+"";

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            ans[d]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ans[i]);
        }

    }
}

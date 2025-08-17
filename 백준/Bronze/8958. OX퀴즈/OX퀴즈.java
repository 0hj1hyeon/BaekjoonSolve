import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            int sum = 0;
            int score = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
    


}

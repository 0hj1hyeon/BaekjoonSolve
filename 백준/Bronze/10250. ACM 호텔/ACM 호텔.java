import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 1; j <= i; j++) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int c = sc.nextInt(); 

            if (c % a == 0) {
           
                System.out.println(a * 100 + (c / a));
            } else {
           
                System.out.println((c % a) * 100 + (c / a + 1));
            }
        }
    }
}

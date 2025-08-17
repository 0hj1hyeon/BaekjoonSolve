import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for(int i =1 ; i<=5; i++){
            a += Math.pow(sc.nextInt(),2);
        }
        System.out.println(a%10);
    }
}
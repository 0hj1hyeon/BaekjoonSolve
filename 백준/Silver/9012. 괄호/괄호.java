import java.io.*;
import java.util.*;

class Stack{
    ArrayList<Character> stack = new ArrayList<>();
    public void push(char c){
        stack.add(c);
    }

    public boolean pop(){
        int len = stack.size();
        if (len == 0) return false;   // 실패 알림
        stack.remove(len - 1);
        return true;
    }
    public boolean isEmpty(){ return stack.isEmpty(); }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int a = sc.nextInt();
        sc.nextLine();

        for(int i =0; i<a; i++){
               String s = sc.nextLine();
               Stack stack = new Stack();
               boolean ok = true;

               for(int j =0; j< s.length();j++){
                   char nc = s.charAt(j);
                    if(nc == '(') stack.push(nc);
                    else if(nc == ')') {
                        if (!stack.pop()) { // 언더플로우 -> NO
                            ok = false;
                            break;
                        }
                    }
               }
            if (ok && stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}

import java.io.*;
import java.util.*;
public class Stackjava {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                char last = st.pop();
                if(ch == '{' && last != '}') {
                    return false;
                }
                else if(ch == '[' && last != ']') {
                    return false;
                }
                else if(ch == '(' && last != ')') {
                    return false;
                }       
            }
        }
        return st.isEmpty();
    }
        

    public static void main(String[] args) {
        Stackjava sl = new Stackjava();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            System.out.println(sl.isBalanced(s));
        }
    }
}

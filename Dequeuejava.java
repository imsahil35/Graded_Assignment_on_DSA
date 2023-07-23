import java.io.*;
import java.util.*;
public class Dequeuejava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dequeue<Integer> dequeue = new ArrayDequeue<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            dequeue.add(num);
            if( i >= m-1){
                max = Math.max(max, new HashSet<>(dequeue).size());
                dequeue.remove();
            }
            if( max == m) {
                break;
            }
        }
        System.out.println(max);
    }
}

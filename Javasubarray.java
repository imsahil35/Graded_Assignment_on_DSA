import java.io.*;
import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for(int i = 0;i<n;i++){
            int sub = arr[i];
            if (sub < 0){
                c = c+1;
            }
            for(int j = i+1;j<n;j++){
                sub += arr[j];
                if (sub < 0){
                    c =c+ 1;
                }
            }
        }
        System.out.println(c);
    }
}

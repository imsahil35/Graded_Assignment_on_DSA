import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class missnoarr {
    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNumbers = new ArrayList<>();
        int min = arr[0];
        int max = arr[arr.length - 1];
        boolean[] presentNo = new boolean[max - min + 1];
        for (int num : arr) {
            presentNo[num - min] = true;
        }
        for (int i = 0; i < presentNo.length; i++) {
            if (!presentNo[i]) {
                missingNumbers.add(i + min);
            }
        }
        return missingNumbers;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> missingNumbers = findMissingNumbers(arr);
        System.out.println("Missing Numbers: " + missingNumbers);
    }
}

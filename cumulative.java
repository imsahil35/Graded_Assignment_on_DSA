import java.util.*;
public class cumulative {
    public static void main(String[] args){
        int arr[] = new int[6];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        try{
            int j=0;
            for(int i=1;i<arr.length;i++){
                arr[i] = arr[j]*arr[i];
                j++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");

        }
    }
}

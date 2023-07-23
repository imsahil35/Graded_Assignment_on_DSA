import java.util.*;

public class pairs {
    public static void main(String arr[]) {
         Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        //int arr[]= {10,10,20,30,40,20,10,10,50};
       ArrayList<Integer> ar= new ArrayList<Integer>();
            ar.add(10);
            ar.add(10);
            ar.add(20);
            ar.add(30);
            ar.add(40);
            ar.add(50);
            ar.add(10);
            ar.add(10);
            ar.add(20);
            ar.add(30);

int count=0;
        //ArrayList li = Arrays.asList(arr);
        for(int a: ar) {
            mp.put(a, mp.get(a)== null?1:mp.get(a)+1);
        }
        for(Map.Entry<Integer, Integer> res: mp.entrySet()) {
            if(res.getValue()%2==1) {
                count+=1;
            }
        }
        System.out.println(count);
    } 
}

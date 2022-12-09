import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        // Sample input
        //5
        //7 1 3 1 3
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        HashMap<Integer,Integer> map= new HashMap<>();

        int ans=0;
        for(int i=0;i<n;i++) {
            int count = 1;
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                count = count + 1;
            }
            map.put(arr[i], count);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
            }
        }
    }
}

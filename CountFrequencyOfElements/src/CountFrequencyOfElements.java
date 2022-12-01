import java.util.*;

public class CountFrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
//   input-     6
//              2 9 7 2 9 2
//   output-    2 3
//              9 2
//              7 1

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        HashMap<Integer,Integer> map = new HashMap<>();
        int [] visited = new int[n];
        for (int i=0;i<n;i++){
            int count = 1;
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                count = count+1;
                visited[i]=-1;
            }
            map.put(arr[i],count);
        }
        for (int i=0;i<n;i++){
            if(visited[i] != -1){
                int fre = map.get(arr[i]);
                System.out.println(arr[i]+" "+fre);
            }
        }
    }
}

import java.util.*;

public class frquencyCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        int max = -1;
        int maxno=-1 ;


        for(int i=0;i<n;i++){
            int count =1;
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                count = count+1;
            }
            map.put(arr[i],count);

            if(count > max){
                maxno =arr[i];
                max = count;
            }

        }
        System.out.print(maxno);


    }
}
1 -2
2 - 4
6 -2
3-2
5 -1
4-1

2-6
3-2
6 -2
1 -2
5 -1
4-1

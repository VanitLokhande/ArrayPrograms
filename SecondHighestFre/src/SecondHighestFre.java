import java.util.HashMap;
import java.util.Scanner;

public class SecondHighestFre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = -1;
        int max2 = -1;
        int maxvalue = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int frequency = 1;
            if(map.containsKey(arr[i])== true){
                frequency = map.get(arr[i]);
                frequency = frequency+1;

            }
            map.put(arr[i],frequency);
            if(max <frequency){
                max2 = max;
                max = frequency;
            }
            else if(max > frequency && max2 < frequency){
                max2 = frequency;
            }


        }



//        System.out.println(max);
        System.out.println(max2);
    }
}

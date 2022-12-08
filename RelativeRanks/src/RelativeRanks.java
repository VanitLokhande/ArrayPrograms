import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RelativeRanks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        int [] sort = new int[n];
        //Leetcode Relative Ranks Problem No No 506.
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        for(int i=0;i<n;i++){
            sort[i] = arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Arrays.sort(sort);

        reverse(sort);

        for(int i=0;i<n;i++){
            System.out.print(sort[i]+" ");
        }
        System.out.println();

        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(i== 0){
                map.put(sort[i],"Gold");
            }
            else if (i==1){
                map.put(sort[i],"Sliver");
            }
            else if (i==2){
                map.put(sort[i],"Bronze");
            }
            else {
                String str = String.valueOf(i+1);
                map.put(sort[i],str);
            }
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                String rank = map.get(arr[i]);
                System.out.print(rank+" ");
            }
        }
    }
    public static void reverse(int [] sort){
        int start = 0;
        int end = sort.length-1;
        while (start<end){
            int temp = sort[start];
            sort[start]=sort[end];
            sort[end]=temp;
            start++;
            end--;


        }
    }
}

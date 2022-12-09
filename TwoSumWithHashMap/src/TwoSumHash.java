import java.util.*;

public class TwoSumHash {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int target = 9;

//        4
//        2 7 11 15

        HashMap<Integer,Integer> map =  new HashMap<>();
         for(int i=0;i<n;i++){
             arr[i]=scan.nextInt();
             map.put(arr[i],i);
         }


        for(int i=0;i<n;i++){
           int num = arr[i];
           int rem = target-num;
           if(map.containsKey(rem)){
               int index = map.get(rem);
               if(i == index)continue;
               System.out.print("("+i +","+index+")");
           }

        }




    }
}

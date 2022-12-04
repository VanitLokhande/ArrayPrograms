import java.util.*;

public class FindTripletWithSumK {
    public static void main(String[] args) {
        int [] arr ={12, 3, 4, 1, 6, 9};
        int n = arr.length;
        int target = 24;
//        [12, 3, 4, 1, 6, 9]
//
//        Sum-24
//
//        12, 3, 9
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++){
            map.add(arr[i]);
        }


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = arr[i]+arr[j];
                int rem = target-sum;
                if(map.contains(rem)){

                    System.out.print("("+arr[i]+" "+arr[j]+" "+rem+")");
                    break;
                }

            }
        }
    }
}

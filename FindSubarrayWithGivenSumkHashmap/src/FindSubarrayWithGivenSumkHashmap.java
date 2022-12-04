import java.util.HashMap;
import java.util.Scanner;

public class FindSubarrayWithGivenSumkHashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 5;
        int cursum=0;
        int start =0;
        int end = -1;
        for(int i=0;i<n;i++){
            cursum= cursum+arr[i];
            int rem = cursum-sum;
            if(sum==cursum){
                start=0;
                end=i;
            }
            else if (map.containsKey(rem)){
                int index = map.get(rem);
                start=index;
                end=i;
            }
            map.put(cursum,i);
        }
        System.out.print(start+" "+end);

    }
    }
//            6
//            10 15 -5 15 -10 5
//            4 5


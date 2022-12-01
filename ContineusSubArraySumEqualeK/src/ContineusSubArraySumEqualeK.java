import java.util.HashMap;
import java.util.Scanner;

public class ContineusSubArraySumEqualeK {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        //Leetcode Problem No 523.
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();

        int sum=0;
        boolean ans  = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            int rem = sum%k;
            if(map.containsKey(rem) && i>=2){
                ans = true;
            }

            map.putIfAbsent(rem,i);
        }

        if(ans == true){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}

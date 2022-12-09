import java.util.Scanner;

public class SumClosestToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int low =0;
        int high =n-1;
        int minsum = 500;
        int a = -1;
        int b = -1;
        while(low<=high){
            int sum = arr[low]+arr[high];
            if(minsum > sum){
                minsum = sum;
                a= arr[low];
                b = arr[high];
            }
            else if(sum < 0){
                low ++;
            }
            else if(sum > 0){
                high--;
            }
        }
        System.out.println(a+" "+b);
    }
}
//        5
//        2 1 4 5 3
//        2 1

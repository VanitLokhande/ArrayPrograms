import java.util.Scanner;

public class CountStrictlyIncreasingSubarrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//  I-    3           4              4
//        1 4 3       1 2 3 4        1 2 2 4
//  O-     1          6              2

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[j-1]){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

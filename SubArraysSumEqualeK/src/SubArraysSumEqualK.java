import java.util.Scanner;
public class SubArraysSumEqualK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int  k = 2;
        int[] arr = new int[n];
        // 4
        // 0 1 1 0
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum +arr[j];

                if(sum == k){
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}

import java.util.*;


public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Majority elements that appers more than n/2 times
        // 1 1 5 6 7 1 1 1    output = 1
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int low =0;
        int high = n-1;
        int mid = (low + high)/2;

        System.out.print(arr[mid]);
    }
}

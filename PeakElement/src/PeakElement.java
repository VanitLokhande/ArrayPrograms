import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int low = 0;
        int hi= arr.length-1;

        while(low <= hi){
            int mid = (low +hi)/2;

            if((mid==0 || arr[mid] >= arr[mid-1]) && (mid == n-1 || arr[mid] >= arr[mid+1])){
                System.out.print(mid);
                break;
            }

            else if( arr[mid]< arr[mid+1]){

                low = mid +1;
            }

            else {
                hi = mid -1;
            }

        }
    }
}

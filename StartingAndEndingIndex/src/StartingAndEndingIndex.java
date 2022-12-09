import java.util.*;


public class StartingAndEndingIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target= sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }


        int low =0;
        int high = n-1;
        int first=-1 ;
        int last=-1 ;

        while(low <=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                first = mid;

                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
        }
         low =0;
        high = n-1;

        while(low <=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;

            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
        }
        System.out.print(first+","+last);
    }
}

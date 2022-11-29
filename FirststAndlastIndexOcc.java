import java.util.*;
public class FirststAndlastIndexOcc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

   //     8
//      1 2 5 5 5 8 9 9
        int[] arr= new int[n];
        int size = arr.length-1;
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        int lo=0;
        int hi=arr.length-1;
        int target =5;
        int fi =-1;
        int li =-1;


        while(lo <= hi){
            int mid =(lo+hi)/2;
            if(arr[mid]==target){
                fi= mid;
                hi = mid-1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
        }
        lo=0;
        hi=arr.length-1;

        while(lo <= hi){
            int mid =(lo+hi)/2;
            if(arr[mid]==target){
                li= mid;
                lo = mid+1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
        }
        System.out.print(fi+" "+li);


    }
}

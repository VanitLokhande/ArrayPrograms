import java.util.*;

public class MinimumElementInASortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int low = 0;
        int high=n-1;

        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] < arr[mid-1]){
                System.out.print(arr[mid]);
                break;
            }
            else  if (arr[mid+1]< arr[mid]){
                System.out.print(arr[mid+1]);
                break;
            }
            else  if (arr[mid]< arr[high]){

                high = mid-1;
            }
            else  if (arr[mid]> arr[high]){
                low = mid+1;
            }
        }
    }
}
//          7
//        120 130 40 50 90 100 110
////        40

//        7
//        50 60 90 100 20 30 40
//        20

//        7
//        20 30 40 50 60 5 10
//        5




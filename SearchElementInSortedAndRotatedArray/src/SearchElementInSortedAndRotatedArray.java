import java.util.Scanner;

public class SearchElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low =0;
        int high = n-1;
        int taget = 10;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] ==  taget){
                System.out.print(mid);
            }
            if(arr[low] < arr[mid]){
                if(arr[mid] >= taget && arr[low] <= taget){
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
                if(arr[mid] <= taget && arr[high] >= taget){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }

            }
        }
    }

}
//        7
//        20 30 40 50 60 5 10
//        6

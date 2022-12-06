import java.util.Scanner;

public class monotonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // monotonic means array should have increasing or decreasing order
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean increase = true;
        boolean decrease = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                increase = false;
            }

            if(arr[i] < arr[i+1]){
                decrease = false;
            }
        }

        if(increase == true || decrease == true){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
//
//5
//        1 2 3 4 5
//        Yes
//5
//        1 1 2 3 4
//        Yes
//5
//        5 4 3 2 1
//        Yes
//5
//        1 3 2 1 4
//        No

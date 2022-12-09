import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Reverse the array without using extra space.

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high]=temp;

            low ++;
            high--;

        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

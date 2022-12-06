import java.util.*;
public class MovesAllzerosToRightWithTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        8
//        1 0 1 0 1 0 1 1

//        1 1 1 1 1 0 0 0

        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int right=1;
        int left = 0;
        while(right<n){
            if(arr[left] != 0){
                right++;
                left++;
            }
            else if(arr[right]==0){
                right++;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

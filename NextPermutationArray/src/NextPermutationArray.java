import java.util.Scanner;

public class NextPermutationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int j=arr.length-1;
        while(j>=0 && arr[j]<=arr[j-1] ){
            j--;
        }
        j--;
        if(j<=0){
            int i = arr.length-1;
            while (arr[j] <= arr[i]){
                i--;
            }
            swap(arr,j,i);
        }

        reverse(arr,j);

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void swap(int[] arr,int j , int i){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int []arr,int j){
        int start = j;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

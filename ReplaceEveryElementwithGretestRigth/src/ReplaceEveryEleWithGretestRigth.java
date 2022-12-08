import java.util.*;

public class ReplaceEveryEleWithGretestRigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        6
//        16 17 4 3 5 2

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int max = arr[n-1];
        arr[n-1] = -1;

        for(int i=n-2;i>=0;i--){
            int temp = arr[i];
            arr[i]=max;
            if(max < temp){
                max= temp;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

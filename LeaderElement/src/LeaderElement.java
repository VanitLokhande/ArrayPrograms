import java.util.*;
public class LeaderElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        5
//        1 2 5 1 2

        int[] arr= new int[n];
        int size = arr.length-1;
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n-1;j++){
                if(arr[i]<= arr[j])
                    break;

            }
            if(j == size){

                System.out.print(arr[i]+" ");


            }
        }


    }
}

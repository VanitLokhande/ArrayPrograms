import java.util.Scanner;

public class FirstMissingPositiveSecondAproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                arr[i]= n+1;
            }
        }

        for(int i=0;i<n;i++){
            int x = Math.abs(arr[i]);
            if(x-1 < n && arr[x-1]> 0){
                arr[x-1]= -arr[x-1];
            }
        }
        int temp = 0;
        for(int i=0;i<n;i++){

            if(arr[i] > 0){
                System.out.print(i+1);
                temp = 1;
                break;


            }
        }
        if (temp == 0) {

            System.out.print(n+1);
        }


    }
}
//  4
//  1 4 5 3
//   2


//        2
//        1 1
//        2

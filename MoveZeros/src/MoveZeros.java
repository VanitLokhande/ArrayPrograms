import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        // 8
        // 1 0 2 3 0 0 0 2



        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }

        while(count < arr.length){
            arr[count++]=0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}

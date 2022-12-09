import java.util.Arrays;
import java.util.Scanner;

public class SortOnlyPositiveNoFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        9
//        12 34 -20 44 -10 56 -2 86 12
//        12 12 -20 34 -10 44 -2 56 86

        int [] arr = new int[n];
        int positive = 0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i] >= 0 ){
                positive++;
            }
        }
        int [] positiv = new int[positive];
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i] >= 0){
                positiv[j++] = arr[i];

            }
        }
        Arrays.sort(positiv);
        j=0;
        for (int i=0;i<n;i++){
            if(arr[i] >= 0){
                arr[i] = positiv[j++];
            }
        }

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}

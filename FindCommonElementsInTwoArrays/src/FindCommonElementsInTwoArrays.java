import java.util.Scanner;

public class FindCommonElementsInTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

    //        5
    //        4
    //        1 3 4 5 7
    //        2 3 5 6
//     output-   3 5

        int [] arr = new int[n];
        int [] arr1 = new int[m];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        int i =0;
        int j = 0;
        while(i<n && j<m){
            if(arr[i] < arr1[j]){
                i++;
            }
            else if(arr[i] > arr1[j]){
                j++;
            }
            else if(arr[i] == arr1[j]){
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }


    }
}

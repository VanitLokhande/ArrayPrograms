import java.util.Scanner;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
//     In-   5
//           4
//           1 3 4 5 7
//           2 3 5 6
//     OT-      1 2 3 4 5 6 7
//        Time Complexity = o(m+n)

        int [] arr = new int[n];
        int [] arr2= new int[m];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr[i] < arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
            }
             else if(arr[i] > arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else if(arr[i] == arr2[j]){
                System.out.print(arr[i]+" ");
                j++;
                i++;
            }
        }
        while(i <n){
            System.out.print(arr[i++]);
        }
        while(j <m){
            System.out.print(arr2[j++]);
        }
    }
}

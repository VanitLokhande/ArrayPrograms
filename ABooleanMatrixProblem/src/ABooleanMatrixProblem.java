import java.util.*;

public class ABooleanMatrixProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         int [][] arr = new int[n][m];
//        You are given a matrix Mat of m rows and n columns. The matrix is boolean so
//        the elements of the matrix can only be either 0 or 1.

         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 arr[i][j]=sc.nextInt();
             }
         }
        boolean[] bolean = new boolean[n];
        for(int i=0;i<n;i++){
            if(!bolean[i]) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                        bolean[i] = true;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            if(bolean[i]==true) {
                for (int j = 0; j < m; j++) {
                    System.out.print("1" + " ");
                }
            }
            else {
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
// Input -
//         5 4
//        1 0 0 0
//        0 0 0 0
//        0 1 0 0    
//        0 0 0 0
//        0 0 0 1

// Output -
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1


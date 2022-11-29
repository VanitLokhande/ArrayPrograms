import java.util.*;

public class TwoDArrayBoundryTravese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(n==1 && m==1) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[0][0]+" ");
            }
        }
        else if(n==1){
            for (int i = 0; i < m; i++) {
                System.out.print(arr[0][i]+" ");
            }
        }

        else if(m==1){
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0]+" ");
            }
        }
        else {

            for (int i = 0; i < m; i++) {
                System.out.print(arr[0][i]+" ");
            }
            for (int i = 1; i < n-1; i++) {
                System.out.print(arr[i][m-1]+" ");
            }
            for (int i = 0; i < m; i++) {
                System.out.print(arr[n-1][i]+" ");
            }
            for (int i = 1; i < n-1; i++) {
                System.out.print(arr[i][0]+" ");
            }

        }


    }
}

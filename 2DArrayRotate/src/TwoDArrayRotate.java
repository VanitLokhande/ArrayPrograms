import java.util.*;

public class TwoDArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //2D array  90 Degree Rotation program
        int [][]arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n-1-i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[n-1-j][i];
                arr[n-1-j][i]=arr[n-1-i][n-1-j];
                arr[n-1-i][n-1-j]=arr[j][n-1-i];
                arr[j][n-1-i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

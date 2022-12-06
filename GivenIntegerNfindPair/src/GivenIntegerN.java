import java.util.*;

public class GivenIntegerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        boolean [] row = new boolean[n];
        boolean [] colum = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(arr[i][j]==1){
                  row[i] = true;
                  colum[j] = true;
              }
            }
        }
        for (int i=0;i<n;i++){

            if(row[i]==true ){
                for( j=0;j<n;j++){

                    System.out.print("1"+" ");
                }
            }
            else {
                for( j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println();
        }


    }
}

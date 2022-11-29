import java.util.Scanner;

public class MatrixArrayPrintOneInColAndRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        boolean [] row = new boolean[n];
        boolean [] colum = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    row[i] = true;
                    colum[j] = true;
                }
            }
        }
        for (int i=0;i<n;i++){
            for( int j=0;j<m;j++) {
                if(row[i] == true || colum[j]==true){
                    arr[i][j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

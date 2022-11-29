import java.util.Scanner;

public class MatrixArraySpiraPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr= new int[r][c];

        for(int i =0; i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

       int right =r-1;
        int left = 0;
        int top=0;
        int bottom =c-1;

        while (left <= right && top <= bottom){
            for (int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");

            }
            top++;

            for (int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");

            }
            right--;

            for (int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");

            }
            bottom--;

            for (int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]+" ");

            }
            left++;

        }


    }
}

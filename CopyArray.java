import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }


        int [] a2 = new int[n];
        for(int i=0;i<n;i++){
            a2[i] = a[i];
        }
        for(int i=0;i<n;i++) {
            System.out.print(a2[i] +" ");
        }

    }
}

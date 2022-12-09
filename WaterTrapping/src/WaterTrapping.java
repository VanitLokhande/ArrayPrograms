import java.util.Scanner;

public class WaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int[] lmax = new int[n];
        int [] rmax = new int[n];

        lmax[0]=arr[0];

        for(int i=1;i<n;i++){
            int temp = Math.max(arr[i],lmax[i-1]);
            lmax[i]=temp;
        }

        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            int temp = Math.max(arr[i],rmax[i+1]);
            rmax[i]=temp;
        }


        int water=0;
        for (int i=1;i<n-1;i++){
            water+= Math.min(rmax[i],lmax[i]) - arr[i];
        }

        System.out.print(water);
    }
}

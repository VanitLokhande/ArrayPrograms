import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 125
        // 130
        // 999

        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int i = arr.length-1;
        int flag = 1;

        while(i >=0){
            if(arr[i] !=9){
                flag = 2;
                arr[i] = arr[i]+1;
                for(int j=0;j<n;j++){
                  System.out.print(arr[j]);
                }
                break;
            }
            arr[i]=0;
            i--;

        }
        if(flag ==1){
            int [] arr2=new int[n+1];
            arr2[0]=1;
            for(int j=0;j<=n;j++){
                System.out.print(arr2[j]+" ");
            }
        }

    }
}

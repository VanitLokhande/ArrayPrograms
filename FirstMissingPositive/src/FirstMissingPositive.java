import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        boolean one = false;

        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                one = true;
            }
            if(arr[i] < 1 || arr[i] > n){
                arr[i] = 1;
            }
        }

       if(one == false){
           System.out.print("111");
       }
       else {
           for(int i=0;i<n;i++){
                int index = Math.abs(arr[i]);
                arr[index-1] = -Math.abs(arr[index-1]);
           }

           for(int i=0;i<n;i++){
               if(arr[i] > 0){
                   System.out.print(i+1);
                   break;
               }
           }
       }
    }
}

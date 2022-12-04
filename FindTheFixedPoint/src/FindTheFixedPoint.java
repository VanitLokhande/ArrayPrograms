import java.util.*;

public class FindTheFixedPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//   I -    5
//          10 5 0 3 7
//   o -    3
//   I -   5
//         0 2 5 8 17
//   o-    0
//   I -    6
//         -10 -5 3 4 7 9
//   o-      -1
 //       Time Complexity =  o(n)

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int flag = 1;

        for(int i=0;i<n;i++){
           if(arr[i]==i){
               flag = 2;
               System.out.print(arr[i]);
           }

        }
        if(flag==1){
            System.out.print(-1);
        }

    }
}

import java.util.*;
public class FindMissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Find the missing number
//        6
//        1 2 3 4 6 7
//        5

        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Time Complexity = o(n)
        int total = (n+1)*(n+2)/2; // formula to sum of number
        for(int i=0;i<n;i++){
            total=total-arr[i];
        }
        System.out.print(total);
    }
}

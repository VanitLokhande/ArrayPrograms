import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

        // 8
        // 1 1 3 3 5 5 7 7

        Set<Integer> set = new HashSet<>() ;

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            set.add(arr[i]);
        }
        int count =0;
        for(int i=0;i<n;i++){
           if(set.contains(arr[i]+1)){
               count++;
           }
        }
        System.out.print(count);

    }
}

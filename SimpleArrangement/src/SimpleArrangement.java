import java.util.Scanner;

public class SimpleArrangement {
    public static void main(String[] args) {
//        Problem Statement
//        Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once), output an array such that A[i] becomes A[A[i]].
//
//        Make sure you don't use extra memory than array itself.
//
//        Output
//        Output the required array of n integers.
//                Example
//        Sample Input
//        5
//        4 2 3 0 1
//
//        Sample Output
//        1 3 0 4 2
//
//        Sample Input
//        10
//        9 5 1 4 7 8 0 6 3 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[arr[i]]+" ");
        }
    }
}

import java.util.Scanner;
public class Increasingarray {
    public static void main(String[] args) {
//        Abhijit has an Array Arr which may or may not be in strictly increasing order. He wants to make this array increasing but does not wish to change the position of any element so he came with an idea that he will replace an element with any of its divisors i.e he changes an element X to M if X%M=0.
//
//        Your task is to tell whether the given array can be transformed to strictly increasing by performing the operation given above.
//        Print "YES" if the array can be transformed in the strictly increasing order else print "NO".
//                Example
//        Sample Input:-
//                5
//        1 2 16 16 16
//
//        Sample Output:-
//                YES
//
//        Sample Input:-
//                4
//        1 3 8 4
//
//        Sample Output:-
//                NO

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int divisor= 2;
        for(int i=0;i<n-1;i++){
            while(arr[i]%divisor != 0){
                divisor++;
            }
            if(divisor >=arr[i+1]){
                System.out.println("NO");
                return;

            }
            arr[i] = divisor;
            divisor++;

        }
        System.out.println("Yes");



    }
}

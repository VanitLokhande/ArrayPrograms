import java.util.Scanner;

public class FindSubArrayWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        int sum = arr[0];

        for(int i=1;i<n;i++){
            if(sum <= 0){
                sum = arr[i];
            }
            else{
                sum = sum + arr[i];
            }

            max = Math.max(sum,max);
        }
        System.out.print(max);

    }
}

//         5
//        1 5 -6 7 1
//        8

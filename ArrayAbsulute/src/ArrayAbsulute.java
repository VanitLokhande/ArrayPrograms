import java.util.Scanner;

public class ArrayAbsulute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] AR = new int[n];

        for(int i=0;i<n;i++){
            AR[i]=sc.nextInt();
        }

        int result=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((AR[j]-AR[i] == k || AR[i]-AR[j] == k) || (i<j)){
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}

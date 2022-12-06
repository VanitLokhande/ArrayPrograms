import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String [] arr = str.split(" ");
        String rev ="";

        for(int i=arr.length-1;i>=0 ;i--){
            rev = rev + arr[i]+" ";

        }
        System.out.print(rev);

    }
}


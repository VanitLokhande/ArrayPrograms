import java.util.Scanner;

public class Allpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//         int p = sc.nextInt();
//        int q  = sc.nextInt();
//        int r = sc.nextInt();
//
//
//
//        int corret = p*4;
//        int wrong = q*2;
//        int notamt = r*1;
//
//        int ans = (corret-wrong-notamt );
//
//        System.out.print(ans);


        int N = sc.nextInt();

        if(N == 1 || N== 6){
//            return 1;
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }



    }
}

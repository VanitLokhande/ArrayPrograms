import java .util.*;

public class FindMinimunDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Find the minimum distance between two numbers
//        12
//        3 5 4 2 6 5 6 6 5 4 8 3
//        4
//        Time Complexcity = O(n^2)

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int min = 2100;
        int x=3;
        int y=6;
        for(int i=0;i<n;i++){
            int distance=0;
            for(int j=i+1;j<n;j++){
                if((arr[i]==x && arr[j]==y)||(arr[j]==x && arr[i]==y)){
                     distance=j-i;
                    if(min > distance){
                        min = distance;
                    }
                }
            }
        }
        System.out.print(min);
    }
}

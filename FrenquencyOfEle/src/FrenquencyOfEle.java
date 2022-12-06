import java.util.HashMap;
import java.util.Scanner;

public class FrenquencyOfEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int [] visited = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int count = 1;
           if(arr[i]<=1 && arr[i]>=5){
               visited[i] = -1;
               int co = map.get(arr[i]);
               count = count+1;
           }
           else  if(arr[i]<=6 && arr[i]>=10){
               visited[i] = -1;
               int co = map.get(arr[i]);
               count = count+1;
           }
           map.put(arr[i],count);
        }

        for(int i=0;i<n;i++){
            if(arr[i]<=5 && arr[i]>=1){
                if(visited[i] != -1) {
                    int fre = map.get(arr[i]);
                    System.out.println('1' + "-" + '5' + " " + fre);
                }
            }
            else if(arr[i]<=10 && arr[i]>=6){
                if(visited[i] != -1) {
                    int fre = map.get(arr[i]);
                    System.out.println('6' + "-" + "10" + " " + fre);
                }
            }

        }
    }
}

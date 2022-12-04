import java.util.HashMap;
import java.util.Scanner;

public class findduplicatesfromanunsortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int []visited =new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int count =1;
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                count = count+temp;
                visited[i]=-1;
            }

            map.put(arr[i],count);
        }

        int flag = 1;
        for(int i=0;i<n;i++){
            int temp = map.get(arr[i]);
            if(temp > 1){
                flag =2;
                if(visited[i] != -1){
                    System.out.print(arr[i]+" ");
                }

            }
        }
        if(flag == 1){
            System.out.print("No");
        }
    }
}

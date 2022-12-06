import java.util.*;

public class MinimiseProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []num1= new int[n];
        int []num2= new int[n];

        for(int i=0;i<n;i++){
            num1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            num2[i]=sc.nextInt();
        }
        Arrays.sort(num1);
        PriorityQueue<Integer> PriorityQueue =new PriorityQueue<>();
        for(int i=0;i<n;i++){
            PriorityQueue.add(num2[i]);
        }

        int i =n-1;
        int result = 0;
        while(!PriorityQueue.isEmpty()){
            int first = num1[i];
            int second = PriorityQueue.poll();

            int product = first*second;
            result = result+product;
            i--;

        }
        System.out.print(result);
    }
}

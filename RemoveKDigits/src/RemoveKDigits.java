import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k= sc.nextInt();
        if(k==0){
            // return str;
        }
        if(k> str.length()){
            // return 0;
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            int n = str.charAt(i) - '0';
            while (!stack.isEmpty() && k>0 && n < stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(n);
        }

        while (!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }

        String ans ="";
        while (!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        int i;
        for(i=0;i<ans.length();i++){
            if(ans.charAt(i) - '0' != '0'){
                break;
            }
        }
        if(i == ans.length()){
            System.out.print(0);
        }
        System.out.print(ans.substring(i));


    }
}

//leetcode problem no 402
//Example 1:
//
//        Input: num = "1432219", k = 3
//        Output: "1219"
//        Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
//        Example 2:
//
//        Input: num = "10200", k = 1
//        Output: "200"
//        Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
//        Example 3:
//
//        Input: num = "10", k = 2
//        Output: "0"
//        Explanation: Remove all the digits from the number and it is left with nothing which is 0.

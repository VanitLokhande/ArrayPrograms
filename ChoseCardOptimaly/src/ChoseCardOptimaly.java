import java.util.*;

// Newton School Contest Problem


//        shubham and maruti play a game. maruti has n cards, the i- th of them has the integer ai written on it.
//         Bob has m  cards, the j- th of them has the integer bj written on it.
//
//        On the first turn of the game, the first player chooses one card and puts it on the table (plays it).
//        On the second turn, the second player choose one card such that the integer on it is greater than the integer
//        on the card played on the first turn, and plays it. On the third turn, the first player chooses one card such
//        that the integer on it is greater than the integer on the card played on the second turn,
//        and plays it, and so on continues.
//        the players take turns, and each player has to choose one of his/her card with greater integer than the card
//        played by the other player on the last turn.
//
//
//        who wins if Maruti is the first player?
//        Print Maruti if "maruti" wins else "Shubham" without quotes.

public class ChoseCardOptimaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] a = new int [n];
        int [] b = new int [m];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }

        int i=0;
        int j=0;



        while(i<n && j<m){
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else if (a[i] == b[j]){
                i++;
                j++;
            }
        }

        if(i == n){
            System.out.print("Shubham");
        }
        else if(j == m){
            System.out.print("Maruti");
        }

    }
}

//    Sample Input:
//        1 2
//        6
//        6 8
//
//        Sample Output:
//        Shubham
//
//        Explanation:
//        maruti has one card with integer 6, shubham has two cards with numbers [6, 8].
//
//        If maruti is the first player, she has to play the card with number 6. shubham then has to play the card with number 8. maruti has no cards left, so he loses.


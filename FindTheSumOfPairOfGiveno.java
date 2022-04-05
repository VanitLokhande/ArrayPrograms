public class FindTheSumOfPairOfGiveno {
    public static void main(String[] args) {
        // Given array should be sorted//
        int [] a = {1,2,3,4,5,6};

        int low = 0;
        int high = a.length - 1;
        int sum = 7;

        while (low < high){
            if(a[low] + a[high] < sum){
                low ++;
            }
            else if(a[low] + a[high] > sum){
                high --;
            }
            else if(a[low] + a[high] == sum){
                high--;
                low++;
            }
            System.out.print("("+low+","+ high+")");
        }
    }
}


public class BinarySerch {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,8};
        int si=0;
        int li= a.length-1;
        int key = 3;
        int ans=-1;
        int mid = (si+li)/2;

        if(si <= li) {
            while (si <= li) {

                if (a[mid] == key) {
                    ans = mid;
                    si = mid + 1;


                } else if (a[mid] < key) {
                    si = mid + 1;
                } else if (a[mid] > key) {
                    li = mid - 1;
                }
                mid = (si + li) / 2;

            }
            System.out.println(ans);
        }





    }
}

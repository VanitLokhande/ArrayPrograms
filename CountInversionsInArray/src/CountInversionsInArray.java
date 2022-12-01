import java.util.Scanner;

public class CountInversionsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        divede(arr,0,n-1);
        System.out.print(coount);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

    }
    public static void divede(int [] arr , int si ,int ei){
        if(si >= ei){
            return;
        }
        int mid = (si+ei)/2;
        divede(arr,si,mid);
        divede(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    static int coount =0;
    public static void conqure(int [] arr,int si,int mid,int ei){
        int [] merge = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] < arr[idx2]) {
                merge[x++]=arr[idx1++];
            }
            else {
                merge[x++]=arr[idx2++];
                coount +=(mid+1-idx1);
            }
        }
        while (idx1 <= mid){
            merge[x++]=arr[idx1++];
        }
        while (idx2 <= ei){
            merge[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j] = merge[i];
        }
    }
}
//        5
//        2 4 1 3 5
//        3

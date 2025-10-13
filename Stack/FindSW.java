import java.util.*;


public class FindSW{

public static int[] Findmaxarr(int arr[],int k){

    int n=arr.length;

    int max[] = new int[n - k + 1];
    int z = 0;

    for (int i = 0; i < n - k + 1; i++) {
        int maximum = Integer.MIN_VALUE;

        for (int j = i; j < i + k; j++) {

            maximum = Math.max(arr[j], maximum);
        }
        max[z++] = maximum;
    }
    return max;

}
    public static void main (String args[]){

        int num[] = { 1, 3, -1, -3, 5, 3, 6, 7 };

        int ans[] = Findmaxarr(num, 3);

        for (int i = 0; i < ans.length - 1; i++) {
            System.out.print(ans[i]+" ");

        }
        
        }
}
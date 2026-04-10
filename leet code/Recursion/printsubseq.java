import java.util.ArrayList;
import java.util.List;

public class printsubseq {

    public static void printingsubseq(int arr[],int i,List<Integer> l,int sum,int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(l);
            }
            return;
        }
        //take
        l.add(arr[i]);
        sum += arr[i];
        printingsubseq(arr, i + 1, l, sum, k);
       
        sum -= arr[i];
        l.remove(l.size() - 1);
    
        //not take
        printingsubseq(arr, i + 1, l,sum,k);
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        int arr[] = { 3, 1, 2 };

        printingsubseq(arr,0,l,0,4);


        
    }    
}

import java.util.ArrayList;
import java.util.List;

public class printsubseq {

    public static void printingsubseq(int arr[],int i,List<Integer> l) {
        if (i == arr.length) {
            System.out.println(l);
            return;
        }
        printingsubseq(arr, i + 1, l);
        l.add(arr[i]);
        printingsubseq(arr, i + 1, l);
        l.remove(l.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        int arr[] = { 3, 1, 2 };

        printingsubseq(arr,0,l);


        
    }    
}

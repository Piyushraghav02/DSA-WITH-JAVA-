
import java.util.HashMap;

public class twosum {
    

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1 };

        int ind=-1,ind2=-1;

        int tar = 6;

        HashMap<Integer,Integer> h1=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
                int findtar=tar-arr[i];

                if (h1.containsKey(findtar)) {
                    ind = i;
                    ind2 = h1.get(findtar);
                }
            else
                h1.put(arr[i], i);
        
        }
        
`       System.out.println("These are the index : -" +);



    }
}

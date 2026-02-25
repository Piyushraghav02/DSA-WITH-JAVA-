

public class Lc_239sliwinmax {
    
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;        
        int arr[]=new int[n-k+1];
        int low=0,maxwin=Integer.MIN_VALUE;

        for(int i=0;i<n-k+1;i++){
            maxwin=nums[i];
            for(int j=i;j<=i+k-1;j++){
                maxwin=Math.max(maxwin, nums[j]);
            }
            arr[low++]=maxwin;
        }
    return arr;
    }
    
    public static void main(String[] args) {
    int nums[]={1,3,-1,-3,5,3,6,7}; 

    int res[]=maxSlidingWindow(nums, 3);

    for (Object elem : res){
        System.out.println(elem+" ");
    }
    }
}

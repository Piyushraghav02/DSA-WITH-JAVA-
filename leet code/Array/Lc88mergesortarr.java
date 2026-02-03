





public class Lc88mergesortarr {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
     
    
        
        // while (low != m && high != n) {
            
        //     if (nums1[low] < nums2[high]) {
        //         a1.add(nums1[low++]);
        //     }
        //     else if(nums1[low]>nums2[high]) {
        //         a1.add(nums2[high++]);
        //     }
        //     else{
        //         a1.add(nums1[low++]);
        //         a1.add(nums2[high++]);
        //     }
        // }
        // int i=0;
        // for (int elem : a1) {
        //     nums1[i++] = elem;
        // }
        
        int low = n+m-1, high = n-1, mid =m-1;
        
        while (low >= 0 && high >= 0) {
            
            if (nums1[mid] < nums2[high]) {
                nums1[low] = nums2[high];
                high--;
                low--;
            }
        }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,0,0,0};
        int nums2[] = { 2, 5, 6 };
        
       

        merge(nums, nums.length, nums2, nums2.length);
    }
}

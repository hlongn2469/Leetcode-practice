class Solution {
    public int search(int[] nums, int target) {
        
        // common case
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while(low <= high){
            mid = (low + high) / 2;
            if(target > nums[mid]){
                low = mid + 1;
            } else if (target < nums[mid]){
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // nums  [-1,0,3,5,9,12], target = 3
    //         l m   
    //               h
    //        0  1 2 3 4 5
}
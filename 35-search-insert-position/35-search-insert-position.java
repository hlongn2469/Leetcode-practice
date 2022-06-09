class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(low <= high){
            mid = (high+low)/2;
            if(target > nums[mid]){
                low = mid + 1;
            } else if(target < nums[mid]){
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
        
        // [1,3,5,6]
        //  ^     ^
        //  l     h
    }
}
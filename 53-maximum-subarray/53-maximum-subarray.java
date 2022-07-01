class Solution {
    public int maxSubArray(int[] nums) {
        // -2, 1, -3, 4, -1, 2, 1, -5, 4
        //     l
        //                   r    
        // l 1
        // r 5
        // sum 1
        // max 2
        if(nums.length == 1){
            return nums[0];
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            max = Math.max(sum, max);
            if(sum <= 0){
                sum = 0;
            }
            
            
        }
        return max;
    }
}
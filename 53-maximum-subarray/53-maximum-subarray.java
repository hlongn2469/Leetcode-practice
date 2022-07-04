class Solution {
    public int maxSubArray(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            largest = Math.max(sum, largest);
            
            
        }
        return largest;
        
        // -2 1 -3 4 -1 2 1 -5 4
        //    i
        // s = 1 
        // l = -2
    }
}
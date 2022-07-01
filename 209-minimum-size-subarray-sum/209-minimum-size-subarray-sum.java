class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int j = 0;
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                min = Math.min(min, i-j + 1);
                j++;
                sum-=nums[j-1];
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
    // [2,3,1,2,4,3]
    //            i
    //          j
    // min = 2
    // sum = 3
}
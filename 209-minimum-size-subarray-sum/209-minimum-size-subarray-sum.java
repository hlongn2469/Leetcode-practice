class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // keeps track of current running sum
        int sum = 0;
        // handle sum dont reach target case
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];
        }
        if(sum < target){
            return 0;
        }
        
        //reset sum
        sum = 0;
        
        // left right pointers
        int left = 0; 
        int right = 0;
        
        // return value
        int min_sub = Integer.MAX_VALUE;
        
        
        
        // loop through list
        while(nums.length >= right){
            
            // if condition met, slide left pointer
            if(sum >= target){
                sum-=nums[left];
                min_sub = Math.min(min_sub,right - left);
                left++;
            
            // if condition not yet met, accumulate sum and slide right pointer
            } else {
                if(nums.length == right){
                    break;
                }
                sum += nums[right++];
            }
            System.out.println("sum: " + sum);
            System.out.println("min_sub: " + min_sub);
        }
        
        // handle last index case
        if(sum >= target){
            min_sub = Math.min(min_sub,right-left);
        }
        
        return min_sub;
    }
    
    // [2,3,1,2,4,3]
    //L   ^
    //R       ^
    // target = 7
    // sum = 0
    // min_subarray = 4;
    
    
}
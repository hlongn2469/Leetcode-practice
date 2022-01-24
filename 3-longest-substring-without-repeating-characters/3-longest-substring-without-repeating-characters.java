class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        String substr = "";
        int longest_substr = 0;
        int ret_val = 0;
        
        // loop through string length
        while(s.length() >= right){
            if(right == s.length()){
                break;
            }
            // if meet condition, then slide left pointer
            if(checkRepeat(substr,s.charAt(right))){
                System.out.println(substr + " | " + ret_val);
                ret_val = Math.max(longest_substr, ret_val);
                System.out.println(substr + " | " + ret_val);
                substr = substr.substring(1);  
                longest_substr--;
                
                
            // if not meet condition, then slide right pointer
            } else {
                substr += s.charAt(right);
                right++;
                longest_substr++;
            }
            
        }
        ret_val = Math.max(longest_substr, ret_val);
        
        return ret_val;
    }
        
        
    // helper function to check repeating characters within a substring
    public boolean checkRepeat(String s, char c){
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
            
        
        // "abcabcbb
        //L  ^
        //R    ^
        //substr = "abc"
        // count = 3
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j = 0,i = 0; j < s.length(); j++){
            // update i pointer if detect a duplicated character
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            // constantly calculate max for each interation
            max = Math.max(max, j - i + 1);
            
            // constantly update the position of the character to the map
            map.put(s.charAt(j), j + 1);
        }
        return max;
        
        // abcabcbb
        // i
        // j
    }
}
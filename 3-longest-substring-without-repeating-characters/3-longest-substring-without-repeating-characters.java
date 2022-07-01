class Solution {
    public int lengthOfLongestSubstring(String s) {
        // abcabcbb
        //   i
        //     j
       
        // longest = 3
        // hm = {a, 4}
        //       b  5
        //       c  3
        //        
       
        int longest = 0;
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < s.length(); j++){
            // if not seen in hashmap, simply put
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i, map.get(s.charAt(j)));
            }
            
            map.put(s.charAt(j), j + 1);
            
            longest = Math.max(longest, j - i + 1);
           
            
            // if seen, get the according index
        }
        return longest;
    }
}
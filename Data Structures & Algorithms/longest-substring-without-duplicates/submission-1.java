class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int length = 0;
        int startIndex = 0;
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(seen.containsKey(c)) {
                startIndex = Math.max(startIndex, seen.get(c) + 1);
            }
            length = Math.max(length, i-startIndex+1);
            seen.put(c, i);
        }

        return length;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> charArray = new HashSet<>();

        for(char c: s.toCharArray()) {
            charArray.add(c);
        }

        int result = 0;

        for(char c: charArray) {
            int l=0, r=0, replacement=0;

            while(r<s.length()) {
                if(s.charAt(r) == c) {
                    r++;
                } else if (replacement < k) {
                    r++;
                    replacement++;
                } else if (s.charAt(l) == c) {
                    l++;
                } else {
                    l++;
                    replacement--;
                }
                result = Math.max(r-l, result);
            }
        }
        return result;
    }
}

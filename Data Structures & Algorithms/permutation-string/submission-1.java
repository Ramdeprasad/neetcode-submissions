class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1F = new int[26];
        for(char c: s1.toCharArray()) {
            s1F[c-'a']++;
        }

        int[] checker = new int[26];

        int l=0, r=0;
        while (r<s2.length()) {
            if(r-l+1 <= s1.length()) {
                if (s1F[s2.charAt(r)-'a'] != 0) {
                    checker[s2.charAt(r)-'a']++;
                }
                r++;
            } else if (Arrays.equals(s1F, checker)) {
                return true;
            } else {
                if (s1F[s2.charAt(l)-'a'] != 0) {
                    checker[s2.charAt(l)-'a']--;
                }
                l++;
            }
        }
        return Arrays.equals(s1F, checker);
    }
}

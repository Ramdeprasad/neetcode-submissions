class Solution {
    public boolean isAnagram(String s, String t) {
        int s_count[] = new int[26];
        int t_count[] = new int[26];

        for (char i: s.toCharArray()) {
            int index = i - 'a';
            s_count[index] += 1;
        }

        for (char i: t.toCharArray()) {
            int index = i - 'a';
            t_count[index] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if(s_count[i] != t_count[i]) {
                return false;
            }
        }
        return true;
    }
}

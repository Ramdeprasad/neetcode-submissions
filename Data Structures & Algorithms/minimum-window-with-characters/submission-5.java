class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || t.length() > s.length()) {
            return "";
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c: t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        String result = "";
        int resultLen = Integer.MAX_VALUE;

        int l=0, have=0;
        Map<Character, Integer> current = new HashMap<>();

        for(int r=0; r<s.length(); r++) {
            char c = s.charAt(r);
            current.put(c, current.getOrDefault(c, 0) + 1);

            if(freq.containsKey(c) && freq.get(c).intValue() == current.get(c).intValue()) {
                have++;
            }

            while (have == freq.size()) {
                if (r-l+1 < resultLen) {
                    resultLen = r-l+1;
                    result = s.substring(l, r+1);
                }
                char left = s.charAt(l);
                current.put(left, current.get(left) - 1);
                if (freq.containsKey(left) && current.get(left) < freq.get(left)) {
                    have--;
                }
                l++;
            }
        }
        return result;
    }
}
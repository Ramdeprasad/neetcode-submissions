class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char start_char = s.charAt(start);
            char end_char = s.charAt(end);
            if (!Character.isLetterOrDigit(start_char)) {
                start++;
            } else if (!Character.isLetterOrDigit(end_char)) {
                end--;
            } else if (Character.toLowerCase(start_char) != Character.toLowerCase(end_char)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}

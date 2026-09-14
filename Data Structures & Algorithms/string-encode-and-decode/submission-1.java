class Solution {

    public String encode(List<String> strs) {
        // Too generic problem without any restriction. Implementing based on the discussion forum
        // <length of string>#<string>....

        if (strs.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String s: strs) {
            int length = s.length();
            sb.append(length);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str == "") {
            return result;
        }

        int currentLen = 0;

        for(int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)) {
                currentLen = (currentLen*10) + c - '0';
            } else if(c == '#') {
                String item = str.substring(i+1, i+1+currentLen);
                result.add(item);
                i+=currentLen;
                currentLen = 0;   
            }
        }
        return result;
    }
}

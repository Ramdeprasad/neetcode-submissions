class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String i: strs) {
            int[] count_array = new int[26];
            for (char c: i.toCharArray()) {
                count_array[c - 'a']++;
            }
            String key = Arrays.toString(count_array);
            if (!result.containsKey(key)) {
                result.put(key, new LinkedList<>());
            }
            result.get(key).add(i);
        }

        return new ArrayList(result.values());
    }
}

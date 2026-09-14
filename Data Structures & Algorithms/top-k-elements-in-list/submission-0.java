class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int i: nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] frequency = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> item: count.entrySet()) {
            if (frequency[item.getValue()] == null) {
                frequency[item.getValue()] = new ArrayList<Integer>();
            }
            frequency[item.getValue()].add(item.getKey());
        }

        int[] result = new int[k];
        int result_index = 0;
        for (int i=frequency.length - 1; i>0; i--) {
            List<Integer> list = frequency[i];
            if (list == null) {
                continue;
            }
            for (Integer item: list) {
                result[result_index] = item.intValue();
                result_index++;
                if (result_index == k) {
                    return result;
                }
            }
        }
        return new int[0];
    }
}

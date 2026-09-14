class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index_map = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            Integer num = nums[i];
            int difference = target - num.intValue();

            if (index_map.containsKey(difference)) {
                return new int[] {index_map.get(difference), i};
            }

            index_map.put(num, i);
        }
        return new int[2];
    }
}

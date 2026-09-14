class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> index_map = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            Integer num = nums[i];
            if (index_map.get(num) == null) {
                index_map.put(num, new ArrayList<Integer>());   
            }
            index_map.get(num).add(i);
        }

        for (int i=0; i< nums.length; i++) {
            int difference = target - nums[i];
            if(index_map.containsKey(difference)) {
                for (Integer index: index_map.get(difference)) {
                    if (i != index) {
                        int[] result = new int[2];
                        result[0] = i;
                        result[1] = index.intValue();
                        return result;
                    }
                }
            }
        }
        return new int[2];
    }
}

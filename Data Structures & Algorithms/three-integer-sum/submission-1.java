class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[j] + nums[k];
                if (sum < -nums[i]) {
                    j++;
                } else if (sum > -nums[i]) {
                    k--;
                } else {
                    List<Integer> currResult = List.of(nums[i], nums[j], nums[k]);
                    if (!result.contains(currResult)) {
                        result.add(currResult);
                    }
                    j++;
                    k--;
                }
            }
        }
        return result;
    }
}

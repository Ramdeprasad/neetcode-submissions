class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i: nums) {
            numbers.add(i);
        }

        Set<Integer> start_nums = new HashSet<>();
        for (int i: nums) {
            if (numbers.contains(i-1)) {
                continue;
            }
            start_nums.add(i);
        }
        int result = 0;
        for(int i: start_nums) {
            int local_max = 1;
            while(numbers.contains(i+1)) {
                local_max += 1;
                i++;
            }
            result = Math.max(local_max, result);
        }
        return result;
    }
}

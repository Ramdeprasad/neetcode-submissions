class Solution {
    public int[] productExceptSelf(int[] nums) {      
        int[] prefix_p = new int[nums.length];
        int[] suffix_p = new int[nums.length];

        prefix_p[0] = 1;
        for (int i=1; i<nums.length; i++) {
            prefix_p[i] = prefix_p[i-1] * nums[i-1];
        }

        suffix_p[nums.length-1] = 1;
        for (int i=nums.length-2; i>=0; i--) {
            suffix_p[i] = suffix_p[i+1] * nums[i+1];
        }

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            result[i] = prefix_p[i] * suffix_p[i];
        }
        return result;
    }
}  

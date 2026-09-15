class Solution {
    public int maxArea(int[] heights) {
        int volume = 0;
        int start = 0;
        int end = heights.length - 1;
        while (start < end) {
            int height = Math.min(heights[start], heights[end]);
            int width = end - start;
            volume = Math.max(volume, height * width);

            if (heights[start] < heights[end]) {
                start++;
            } else if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return volume;
    }
}

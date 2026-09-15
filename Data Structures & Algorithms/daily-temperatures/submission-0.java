class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        stack.push(new int[] { temperatures[0], 0 });

        for(int i=1; i<temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] element = stack.pop();
                result[element[1]] = i - element[1];
            }
            stack.push(new int[] { temperatures[i], i });
        }
        return result;
    }
}

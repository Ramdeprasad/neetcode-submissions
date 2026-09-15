class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens) {
            try {
                stack.push(Integer.parseInt(s));
            } catch(Exception e) {
                Integer right = stack.pop();
                Integer left = stack.pop();
                switch(s) {
                    case "+": 
                        stack.push(left+right);
                        break;
                    case "-": 
                        stack.push(left-right);
                        break;
                    case "*": 
                        stack.push(left*right);
                        break;
                    case "/": 
                        stack.push(left/right);
                        break;
                }
            }
        }
        return stack.pop();
    }
}

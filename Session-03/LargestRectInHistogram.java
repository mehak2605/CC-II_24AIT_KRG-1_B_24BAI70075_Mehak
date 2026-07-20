class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        int bars[]=Arrays.copyOf(heights, n+1);
        bars[n]=0;
        int maxArea=0;
        for(int i=0; i<n+1; i++)
        {
            while(!stack.isEmpty() && bars[stack.peek()]>bars[i])
            {
                int h=bars[stack.pop()];
                int width=stack.isEmpty()? i: i-stack.peek()-1;
                maxArea=Math.max(maxArea, h*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
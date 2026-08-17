class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0, r=n-1;
        int leftmax=height[l];
        int rightmax=height[r];
        int ans=0;
        while(l<=r)
        {
            if(leftmax<rightmax)
            {
                leftmax=Math.max(leftmax, height[l]);
                ans+=leftmax-height[l];
                l++;
            }
            else
            {
                rightmax=Math.max(rightmax, height[r]);
                ans+=rightmax-height[r];
                r--;
            }
        }
        return ans;
    }
}
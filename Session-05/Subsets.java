import java.util.*;
class Solution {
    public void solve(List<Integer> curr, List<List<Integer>> ans, int idx, int nums[])
    {
        if(idx>=nums.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        solve(curr, ans, idx+1, nums);
        curr.remove(curr.size()-1);
        solve(curr, ans, idx+1, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(new ArrayList<>(), ans, 0, nums);
        return ans;
    }
}
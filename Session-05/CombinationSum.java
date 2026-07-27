class Solution {
    public void solve(List<Integer> curr, List<List<Integer>> ans, int idx, int target, int sum, int nums[])
    {
        if(sum==target)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(sum>target || idx>=nums.length)
        return;
        
        curr.add(nums[idx]);
        solve(curr, ans, idx, target, sum+nums[idx], nums);
        curr.remove(curr.size()-1);
        solve(curr, ans, idx+1, target, sum, nums);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(new ArrayList<>(), ans, 0, target, 0, candidates);
        return ans;
    }
}
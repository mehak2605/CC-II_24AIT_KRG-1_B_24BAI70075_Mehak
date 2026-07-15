import java.util.*;
class ContainsDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap<Integer, Integer> map=new HashMap<>();
        // for(int i=0; i<nums.length; i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         if(i-map.get(nums[i])<=k)
        //         return true;
        //     }
        //     map.put(nums[i], i);
        // }
        // return false;
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++)
        {
            if(set.contains(nums[i]))
            return true;

            set.add(nums[i]);

            if(set.size()>k)
            set.remove(nums[i-k]);
        }
        return false;
    }
}
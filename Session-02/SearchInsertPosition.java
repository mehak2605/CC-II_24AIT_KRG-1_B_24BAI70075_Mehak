class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int first=0;
        int last=nums.length-1;
        int mid;
        if(target>nums[nums.length-1])
        return nums.length;
        if(target<nums[0])
        return 0;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(target>nums[mid])
            first=mid+1;
            else if(target<nums[mid])
            last=mid-1;
            else
            return mid;
        }
        return first;
    }
}
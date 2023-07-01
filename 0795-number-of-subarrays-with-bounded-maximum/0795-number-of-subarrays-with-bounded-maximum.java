class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
    
         int count = 0;
        int start = 0;
        int validSubarrays = 0;
        
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] >= left && nums[end] <= right) {
                validSubarrays = end - start + 1;
                count += validSubarrays;
            } else if (nums[end] < left) {
                count += validSubarrays;
            } else {
                start = end + 1;
                validSubarrays = 0;
            }
        }
        
        return count;
    }
}
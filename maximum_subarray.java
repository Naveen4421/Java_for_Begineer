class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int curr=nums[0];
        for (int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max_sum=Math.max(curr,max_sum);
        }
        return max_sum;

        
    }
}

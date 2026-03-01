class Solution {
    public int maxProduct(int[] nums) {
        int curr;
        int min_product=nums[0];
        int max_product=nums[0];
        int result=nums[0];
        for (int i=1;i<nums.length;i++){
            curr=nums[i];
            int temp=max_product;
            max_product=Math.max(curr,Math.max(max_product*nums[i],min_product*nums[i]));
            min_product=Math.min(curr,Math.min(temp*nums[i],min_product*nums[i]));
            result=Math.max(max_product,result);   
        }
        return result;
        
    }
}

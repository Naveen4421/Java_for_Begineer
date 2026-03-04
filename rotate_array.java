class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] result=new int[n];
        int index=0;
        for(int i=n-k;i<n;i++ ){
            result[index]=nums[i];
            index++;
        }
        for(int j=0;j<n-k;j++){
            result[index]=nums[j];
            index++;
        }
        for(int h=0;h<n;h++){
            nums[h]=result[h];
        }
        
    }
}

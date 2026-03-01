class solution{
public int[] twosum(int[] nums,int target){
for(int i=0;i<nums.length-1;i++){
for(int j=i+1;j<nums.length;j++){
if(nums[i]+nums[j]==target){
return new int[]{i,j};
}
}
}
return new int[]{-1,-1};
}
public static void main(String[] args){
solution sol=new solution();
int [] nums={2,7,11,15};
int target=9;

int[] result=sol.twosum(nums,target);
System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}

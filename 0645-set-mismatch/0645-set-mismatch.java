class Solution {
    public int[] findErrorNums(int[] nums) {
        int j=0;
        while(j<nums.length){
            int correct=nums[j]-1;
            if(nums[j]!=nums[correct]){
                int temp=nums[j];
                nums[j]=nums[correct];
                nums[correct]=temp;
            }else
                j++;
        }
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
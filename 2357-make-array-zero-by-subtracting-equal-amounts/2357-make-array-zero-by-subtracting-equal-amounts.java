class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        while(true){
            count++;
            int min=Integer.MAX_VALUE;
            for(int k:nums){
                if(k !=0){
                    min=Math.min(min,k);
                }
            }
            if(min==Integer.MAX_VALUE){
                break;
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                    nums[i]-=min;
            }
        }
        return count-1;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, res=nums.length+1, sum=0;
        for(int r=0;r<nums.length;r++){
            sum=sum+nums[r];
            while(sum>=target){
                res=Math.min(res,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(res==nums.length+1) res=0;
        return res;
    }
}
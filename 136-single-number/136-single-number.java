class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int ans=0;
        if(len==1){
            ans=nums[0];
        } 
        else{
            for(int i=0;i<len-1;i+=2){
            if(nums[i]!=nums[i+1]){
                ans=nums[i];
                break;
            }
            else
            {
                ans=nums[len-1];
            }
        }
        }
        return ans;
    }
}
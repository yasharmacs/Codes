class Solution {
    public boolean checkPossibility(int[] nums) {
        //7,10,6
        //7,10,8
        int mod=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                mod++;
                
                if(i>=2 && nums[i-2]>nums[i]){
                    nums[i]=nums[i-1]; // 7,10,6 --> 7,10,10
                }
                else{
                    nums[i-1]=nums[i];  //7,10,8 --> 7,8,8
                }
            }
        }
        return mod<=1;
    }
}
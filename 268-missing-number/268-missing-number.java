class Solution {
    public int missingNumber(int[] nums) {
        int arrayKiSize=nums.length;
        //[0-arrayKiSize]
        int count=0;
        int countTotal=0;
        for(int i=0;i<=nums.length;i++){
            countTotal+=i;
        }
        
        
        //arraKiSize Ka elements ka sum;
        
        for(int ele: nums){
            count+=ele;
        }
        return countTotal-count;
        
    }
}
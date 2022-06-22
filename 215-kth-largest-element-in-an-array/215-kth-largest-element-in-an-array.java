class Solution {
    public int findKthLargest(int[] nums, int k) {
        //1,2,3,4,5,6
        //k th largest element in array is 5 as value of K is 2;
         // int arr[]={3,2,3,1,2,4,5,5,6}
        Arrays.sort(nums);
        int store=0;
        
        for(int i=nums.length-1;i>=0;i--){
            if(k+i==nums.length){
                store=nums[i];
            }
        }
        return store;
    }
}
/*

*/
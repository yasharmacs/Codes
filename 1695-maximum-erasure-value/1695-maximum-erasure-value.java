class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0,n=nums.length,max=Integer.MIN_VALUE,sum=0;
        HashSet<Integer> hset=new HashSet<>();
        
        while(r<n){
            if(hset.contains(nums[r])){
                sum-=nums[l];
                hset.remove(nums[l]);
                l++;
            }
            else
            {
                hset.add(nums[r]);
                sum+=nums[r];
                r++;
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
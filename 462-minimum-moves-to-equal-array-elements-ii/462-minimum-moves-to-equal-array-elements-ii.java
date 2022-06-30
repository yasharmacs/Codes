class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums.length/2;
        int moves=0;
        for(int i=0;i<nums.length;i++){
            int s=Math.abs(nums[median]-nums[i]);
            if(s>0){
                moves+=s;
            }
        }
        return moves;
    }
}
/*

1--2--9--10
1--0--7--8=16

0,0,1,6,8
5/2=2----1
1,1,0,5,7=14

*/
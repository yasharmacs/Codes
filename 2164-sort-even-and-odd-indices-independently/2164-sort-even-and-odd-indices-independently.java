class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even=new PriorityQueue<>();
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0) even.add(nums[i]);
            else{
                odd.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0) arr[i]=even.poll();
            else{
                arr[i]=odd.poll();
            }
        }
        return arr;
    }
}
/*
odd= ulta
even= seedha
*/
class Solution {
    public int maximumProduct(int[] nums, int k) {
        //sabse chota element array se nikalo and usko +1 karke wapis array mein add kar do
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        for(int i=0;i<k;i++){
            pq.add(pq.poll()+1);
        }
        long ans=1;
        int mod=1000000007;
        while(!pq.isEmpty()){
            ans*=pq.poll();
            ans%=mod;
        }
        return (int)ans;
    }
}
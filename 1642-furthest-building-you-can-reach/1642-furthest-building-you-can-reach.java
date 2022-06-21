class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
       PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff<=0){
                continue;
            }
            if(diff>0){
                pq.add(diff);
            }
            if(pq.size()>ladders){
                bricks-=pq.poll();
            }
            if(bricks<0){
                return i;
            }
        }
        return arr.length-1;
    }
}
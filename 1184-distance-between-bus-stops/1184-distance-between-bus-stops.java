class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total=0;
        for(int dist:distance){
            total+=dist;
        }
        int newStart=Math.min(start,destination);
        int newEnd=Math.max(start,destination);
        int ans=0;
        for(int i=newStart;i<newEnd;i++){
            ans+=distance[i];
        }
        return Math.min(ans,total-ans);
    }
}
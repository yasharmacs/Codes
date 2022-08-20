class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int res=0, currDistance = startFuel;
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> stations[b][1]-stations[a][1]);
        // PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(currDistance<target){
            while(i<stations.length && stations[i][0]<=currDistance){
                pq.add(i);
                i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            currDistance +=stations[pq.poll()][1];
            ++res;
        }
        return res;
    }
}
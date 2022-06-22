class Solution {
    public static class Pair implements Comparable<Pair>{
        int a;
        int b;
        int c;
        Pair(int a, int b , int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public int compareTo(Pair o){
            return this.c-o.c;
        }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int res[][] = new int[k][2];
        
        for(int i = 0; i < points.length; i++){
            int a = points[i][0];
            int b = points[i][1];
            int c = a*a + b*b;
            pq.add(new Pair(a,b,c));
        }
        for(int i = 0; i < k; i++){
            Pair p1 = pq.poll();
            res[i][0] = p1.a;
            res[i][1] = p1.b;
        }
        return res;
    }
}
class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int dp[][]=new int[t.size()][t.size()];
        for(int i=0;i<t.size();i++)
            Arrays.fill(dp[i],-1);
        return helper(0,0,dp,t);    
    }
    
    private int helper(int start, int end, int[][] dp,List<List<Integer>> t){
        if(start==t.size()-1){
            return t.get(t.size()-1).get(end);
        }
        if(dp[start][end] != -1){
            return dp[start][end];
        }
        int down=t.get(start).get(end)+helper(start+1,end,dp,t);
        int diag=t.get(start).get(end)+helper(start+1,end+1,dp,t);
        return dp[start][end]=Math.min(down,diag);  
    }
}
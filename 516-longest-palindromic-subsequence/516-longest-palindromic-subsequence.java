class Solution {
   public int longestPalindromeSubseq(String s) {
        String r = "";
        for(int i = 0; i < s.length(); i++)
            r = s.charAt(i) + r;
        
        int max = 0;
        int[][] dp = new int[s.length() + 1][r.length() + 1];
        
        for(int i = 1; i < s.length()+1; i++) {
            for(int j = 1; j < r.length()+1; j++) {
                
                if(s.charAt(i-1) == r.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return max;
    }
}
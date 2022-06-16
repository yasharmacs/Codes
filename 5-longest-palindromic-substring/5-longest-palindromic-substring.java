class Solution {
   public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        if(s.length() == 1) return s;
        
        int palindromeStart = 0;//longest palindrome substring start index
        int palindromeEnd = 0;//longest palindrome substring end index
        int size = s.length();
        
        boolean[][] dp = new boolean[size][size];//true if from i to j in s is a palindrome
        for(int i = size - 1; i >= 0; i--){
            for(int j = i; j < size; j++){
                if(j == i){
                    //single character (sub-string of length 1)
                    dp[i][i] = true;
                } else if(j == i + 1){
                    //sub-string of length 2
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                } else {
                    //sub-string of length > 2
                    if(s.charAt(i) == s.charAt(j) && (i+1 < size) && (j-1 >= 0))
                       dp[i][j] = dp[i+1][j-1]; 
                }
                
                //update palindrome start and end index if find longer palidrome substring
                if(dp[i][j] && (j - i) > (palindromeEnd - palindromeStart)){
                    palindromeStart = i;
                    palindromeEnd = j;
                }
            }
        }
        
        return s.substring(palindromeStart, palindromeEnd + 1);
    }
}
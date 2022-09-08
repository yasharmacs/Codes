class Solution {
    public int triangularSum(int[] arr) {
        int n=arr.length;
     for(int i=0;i<n;i++){
         for(int j=0;j<n-i-1;j++){
             arr[j]=(arr[j]+arr[j+1])%10;
         }
     }   
        return arr[0];
    }
}
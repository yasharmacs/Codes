// class Solution {
//     public int kthSmallest(int[][] mat, int k) {
//         List<Integer> al=new ArrayList<>();
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat.length;j++){
//                 al.add(mat[i][j]);
//             }
//         }
//         int c=0;
//         int ans=0;
//         Collections.sort(al);
//         for(int a:al){
//             c++;
//             if(c==k){
//                 ans=a;
//             }
//         }
//         return ans;
//     }
// }
 class Solution {
     public int kthSmallest(int[][] mat,int k){
         //binary search    why?? WE SAW SORTED!!!
         int n=mat.length;
         int l=mat[0][0];
         int h=mat[n-1][n-1];
         while(l!=h){
             int mid=l+(h-l)/2;
             int count=count(mat,mid);
             if(count<k){
                 l=mid+1;
             }
             else{
                 h=mid;
             }
         }
         return l;
     }
     public int count(int[][] mat, int s){
         int count=0;
         int row=0;
         int col=mat.length-1;
         while(row<mat.length && col>=0){
             if(mat[row][col]<=s){
                 count+=col+1;  // bcz array sorted ha. to agar col vali value small ha toh usse phele wali bhi small hi hogi. toh +1 kar dia.
                 row++;
             }
             else{
                 col--;
             }
         }
         return count;
     }
 }
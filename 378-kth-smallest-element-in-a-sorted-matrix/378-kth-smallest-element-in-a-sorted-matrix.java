class Solution {
    public int kthSmallest(int[][] mat, int k) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                al.add(mat[i][j]);
            }
        }
        int c=0;
        int ans=0;
        Collections.sort(al);
        for(int a:al){
            c++;
            if(c==k){
                ans=a;
            }
        }
        return ans;
    }
}
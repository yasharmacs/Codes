class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<row;i++){
            helper(mat,i,0,row,col,ans);
        }
        for(int i=0;i<col;i++){
            helper(mat,0,i,row,col,ans);
        }
        return mat;
    }
    private void helper(int[][] mat,int i,int j,int row,int col,List<Integer> ans){
        int q=i;
        int w=j;
        while(q<row && w< col){
            ans.add(mat[q][w]);
            q++;
            w++;
        }
        Collections.sort(ans);
        q=i;
        w=j;
        for(int k=0;k<ans.size();k++){
            mat[q][w]=ans.get(k);
            q++;
            w++;
        }
        ans.clear();
    }
}
class Solution {
    List<List<Integer>> fal= new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(1,n,k,new ArrayList<Integer>());
        return fal;
    }
    private void helper(int start,int n,int k,List<Integer> al){
        if(al.size()==k){
            fal.add(new ArrayList<>(al));
            return;
        }
        for(int i=start;i<=n;i++){
            al.add(i);
            helper(i+1,n,k,al);
            al.remove(al.size()-1);
        }
    }
}
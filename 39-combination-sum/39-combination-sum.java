class Solution {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> fal=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        int idx=0;
        helper(fal,al,candidates,target,idx);
        return fal;
    }
    public void helper(List<List<Integer>> fal , List<Integer> al , int[] candidates , int target , int idx){
        if(idx==candidates.length){
            if(target==0){
            fal.add(new ArrayList<>(al));
            
        }
            return;
        }
        if(candidates[idx]<=target){
            al.add(candidates[idx]);
            helper(fal,al,candidates,target-candidates[idx],idx);
            al.remove(al.size()-1);
        }
        
            helper(fal,al,candidates,target,idx+1);
        
    }
}
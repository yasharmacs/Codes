class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> fal=new ArrayList<>();
        int idx=0;
        helper(fal,idx,candidates,new ArrayList<>(),target);
        return fal;
    }
    
    public void helper(List<List<Integer>> fal,int idx,int[] candidates , List<Integer> al ,int target){
        
        if(target==0){
            if(!fal.contains(new ArrayList<Integer>(al))){
                 fal.add(new ArrayList<>(al));
            }
           
            return;
        }
        if(target<0){
            return;
        }
        
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            al.add(candidates[i]);
            helper(fal,i+1,candidates,al,target-candidates[i]);
            al.remove(al.size()-1);
        }
    }
}
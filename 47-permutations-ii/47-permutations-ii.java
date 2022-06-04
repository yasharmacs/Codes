class Solution {
    List<List<Integer>> fal=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> al=new ArrayList<>();
        helper(al,nums,0,new boolean[nums.length]);
        return fal;
    }
    
    public void helper(List<Integer> al , int[] nums , int idx,boolean[] arr){
        
        if(al.size()==nums.length){
               fal.add(new ArrayList<>(al));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
// if (used[i] == 1 || i > 0 && A[i] == A[i - 1] && used[i - 1] == 0) continue;
        if(arr[i]==true || i>0 && nums[i]==nums[i-1] && arr[i-1]==false){
                continue;
            }
                arr[i]=true;
                al.add(nums[i]);
                helper(al,nums,idx,arr);
                al.remove(al.size()-1);
                arr[i]=false;
            
        }
    }
}
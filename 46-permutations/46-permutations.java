class Solution {
    List<List<Integer>> fal=new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> al=new ArrayList<>();
        helper(al,nums,0,new boolean[nums.length]);
        return fal;
    }
    public void helper(List<Integer>al , int[] nums , int idx,boolean[] arr){
        
        //base condition
        if(idx==nums.length){
            fal.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                al.add(nums[i]);
                helper(al,nums,idx+1,arr);
                al.remove(al.size()-1);
                arr[i]=false;
            }
        }
       
    }
}
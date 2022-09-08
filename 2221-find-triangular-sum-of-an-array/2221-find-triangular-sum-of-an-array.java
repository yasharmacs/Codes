class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            n.add(nums[i]);
        }
        List<List<Integer>> fal=new ArrayList<>();
        fal.add(n);
        for(int i=0;i<n.size()-1;i++){
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<fal.get(i).size()-1;j++){
                al.add((fal.get(i).get(j)+fal.get(i).get(j+1))%10);
            }
            fal.add(al);
        }
        int z=fal.size();
        // return fal.get(z).get(0);
        // for(int i=0;i<z;i++){
        //     fal
        // }
        // System.out.println("ANS");
        // System.out.println(fal.get(4).get(0));
        return fal.get(z-1).get(0);
    }
}
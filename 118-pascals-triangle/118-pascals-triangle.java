class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> fal=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    al.add(1);
                }
                else{
                    al.add(fal.get(i-1).get(j-1)+fal.get(i-1).get(j));
                }
            }
            fal.add(al);
        }
        return fal;
    }
}
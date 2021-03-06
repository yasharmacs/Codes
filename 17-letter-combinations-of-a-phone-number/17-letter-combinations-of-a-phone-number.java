class Solution {
    public List<String> letterCombinations(String digits) {
        String[] set =new String[10];
        set[2]="abc";
        set[3]="def";
        set[4]="ghi";
        set[5]="jkl";
        set[6]="mno";
        set[7]="pqrs";
        set[8]="tuv";
        set[9]="wxyz";

            
            
        List<String> ans=new ArrayList<String>();
        if(digits==null || digits.length()==0){
            return ans;
        }
        helper(ans,digits,set,0,"");
        return ans;
    }
    private void helper(List<String> ans,String digits,String[] set,int index,String current){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String permutation=set[digits.charAt(index)-'0'];
        for(char c: permutation.toCharArray()){
            helper(ans,digits,set,index+1,current+c);
        }
    }
}
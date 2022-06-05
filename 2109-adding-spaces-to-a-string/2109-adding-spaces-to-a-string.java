class Solution {
    public String addSpaces(String s, int[] spaces) {
      StringBuilder sb=new StringBuilder();
        int l=spaces.length;
        int idx=0;
        for(int i=0;i<s.length();i++){
            
            if(idx!=l){
              if(i==spaces[idx] && idx<=l){
                sb.append(' ');
                idx++;
            }  
            }
            
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
}
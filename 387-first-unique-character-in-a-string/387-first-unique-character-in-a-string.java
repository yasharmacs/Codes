class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char h=s.charAt(i);
            map.put(h,map.getOrDefault(h,0)+1);
        }
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char h=s.charAt(i);
            if(map.get(h)==1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
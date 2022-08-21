class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        int left=0;
        int r=0;
        int len=0;
        while(r<s.length()){
            if(hmap.containsKey(s.charAt(r))){
                left=Math.max(hmap.get(s.charAt(r))+1,left);
            }
            hmap.put(s.charAt(r),r);
            len=Math.max(r-left+1,len);
            r++;
        }
        return len;
    }
}
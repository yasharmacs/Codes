class Solution {
    public int minDeletions(String s) {
        //freq count
        //put in set and if its already present in set then decrease the value and increase the deletion factor
        
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Set<Integer> st=new HashSet<>();
        int del=0;
        for(int c: freq){
            while(c>0 && st.contains(c)){
                del++;
                c--;
            }
            st.add(c);
        }
        return del;
    }
}

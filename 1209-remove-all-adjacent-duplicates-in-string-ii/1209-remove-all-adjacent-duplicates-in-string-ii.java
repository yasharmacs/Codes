class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character,Integer>> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(st.isEmpty() || st.peek().getKey() !=c){
                st.push(new Pair<>(c,1));
            }
            else{
                Pair<Character,Integer> top=st.pop();
                st.push(new Pair<>(top.getKey(),top.getValue()+1));
                
                if(st.peek().getValue()==k){
                    st.pop();
                }
            }
        }
        String ans="";
        while(!st.isEmpty()){
            Pair<Character,Integer> top=st.pop();
            int freq=top.getValue();
            while(freq-->0){
                ans=top.getKey()+ans;
            }
        }
        return ans;
    }
}



/*
Stack<Pair<Key,Value>> 


*/
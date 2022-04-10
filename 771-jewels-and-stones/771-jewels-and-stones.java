class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map2.put(stones.charAt(i),map2.getOrDefault(stones.charAt(i),0)+1);
        }
        
        for(int i=0;i<jewels.length();i++){
            if(map2.containsKey(jewels.charAt(i))){
                ans=ans+map2.get(jewels.charAt(i));
            }
        }
        
        
        
return ans;
        

        
    }
}
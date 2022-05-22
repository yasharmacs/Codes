class Solution {
    public int countSubstrings(String s) {
        int totalC=0;
        for(int i=0;i<s.length();i++){
            totalC += getSubsCount(i,i,s);    //odd
            totalC += getSubsCount(i,i+1,s);  //even
            
        } 
        return totalC;
    }
    private int getSubsCount(int start,int end , String s){
        int c=0;
        
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
            c++;
        }
        return c;
    }
}
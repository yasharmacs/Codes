class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        String revWord="";
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            revWord += sb.toString()+" ";
        }
    return revWord.trim();
    }
}
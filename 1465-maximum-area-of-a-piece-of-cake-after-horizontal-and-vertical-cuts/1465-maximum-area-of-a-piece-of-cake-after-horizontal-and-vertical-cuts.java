class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(verticalCuts);
        Arrays.sort(horizontalCuts);
        
        int lenh=horizontalCuts.length;
        int lenv=verticalCuts.length;
        
        int hdiff=horizontalCuts[0]-0;;
        int vdiff=verticalCuts[0]-0;
        
        for(int i=1;i<lenh;i++){
            hdiff=Math.max(hdiff,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        
        hdiff=Math.max(hdiff,h-horizontalCuts[horizontalCuts.length-1]);
        for(int j=1;j<lenv;j++){
            vdiff=Math.max(vdiff,verticalCuts[j]-verticalCuts[j-1]);
        }
        vdiff=Math.max(vdiff,w-verticalCuts[verticalCuts.length-1]);
        
        return(int)(((long)hdiff*vdiff)%1000000007);
    }
    
}
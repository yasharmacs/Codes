class Solution {
    public int kthGrammar(int n, int k) {
        // learnt by aditya Verma.
        //base
        if(n==1 || k==1){
            return 0;
        }
        int power=(int)(Math.pow(2,n-1));
        int mid=power/2;
        //indcution method
        if(k<=mid){
            return kthGrammar(n-1,k);
        }
        else{
            return (kthGrammar(n-1,k-mid)^1);
        }
    }
}
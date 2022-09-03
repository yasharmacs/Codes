class Solution {
    List<Integer> al=new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<10;i++){
            helper(i,i,n-1,k);
        }
        int[] arr=new int[al.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
    private void helper(int num,int digit,int n,int k){
        if(n==0){
            al.add(num); 
            return;
        } 
        if(digit+k<10){
            helper(num*10+(digit+k),digit+k,n-1,k);
        }
        if(k!=0 && digit-k>=0){
            helper(num*10+(digit-k),digit-k,n-1,k);
        }
    }
}
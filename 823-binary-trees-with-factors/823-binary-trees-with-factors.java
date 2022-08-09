class Solution {
    int mod=1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        Map<Integer,Long> hmap=new HashMap<>();
        Arrays.sort(arr);
        long ans=1;
        hmap.put(arr[0],ans);
        for(int i=1;i<arr.length;i++){
            long count=1;
            for(int j=0;j<i;j++){
                int x=arr[j];
                if(arr[i]%x==0 && hmap.containsKey(arr[i]/x))
                {
                    count+=hmap.get(x)*hmap.get(arr[i]/x);
                }
            }
            hmap.put(arr[i],count);
            ans+=count;
        }
        return (int)(ans%mod);
    }
}
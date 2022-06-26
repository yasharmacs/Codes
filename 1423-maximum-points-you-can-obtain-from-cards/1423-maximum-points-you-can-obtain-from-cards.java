class Solution {
    public int maxScore(int[] arr, int k) {
        // int start=0;
        // int end=arr.length-1;
        // int startSum=0;
        // int endSum=0;
        // while(start<=arr.length-1 && end>=0 && k>0){
        //     startSum+=arr[start];
        //     endSum+=arr[end];
        //     start++;
        //     end--;
        //     k--;
        // }
        // if(startSum>endSum) return startSum;
        // return endSum;
        // Approach:- arr ke start ke k elements ka sum le le and fir shuru ke K elemeents mein se 1 kam karte ja and last se 1 add karte ja and max sum store karate ja.
//this how tha maxSum which we will get is the ans.
        
        int len=arr.length;
        int sumOfKElements=0;
        
        
        for(int i=0;i<k;i++)
        {
            sumOfKElements+=arr[i];
        }   
        int i=0;
        int max=sumOfKElements;
        while(i<k){
            sumOfKElements= sumOfKElements- arr[k-i-1]+arr[len-1-i];
            max=Math.max(max,sumOfKElements);
            i++;
        }
        return max;
    }
}
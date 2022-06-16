class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

		int product=1;

		for(int num : nums){
			product *= num;
			max = Math.max(product,max);
			if(product == 0)product = 1;

		}

		product = 1;
		for(int i=nums.length-1;i>=0;i--){
			product *= nums[i];
			max = Math.max(product,max);
			if(product ==0) product = 1;
		}

		return max;
    }
}
/*
Agar Kahi bhi array mein 0 aajayega toh product 0 ho jayega
toh apan uss 0 ke baad se firse shrur krenga...kaisa?
product =1 kakrek aage se multiply karna shuru kr denga
*/
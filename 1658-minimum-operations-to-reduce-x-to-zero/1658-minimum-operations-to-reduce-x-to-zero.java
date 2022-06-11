class Solution {
    public int minOperations(int[] A, int x) {
    int n = A.length, sum = 0, j = 0, res = -1;
    int target = -x;
    for (int a : A) target += a;
    if (target < 0) return -1;

    for (int i = 0; i < n; i++) {
        sum += A[i];

        while (sum > target) {
            sum -= A[j++];
        }
        if (sum == target) {
            res = Math.max(res, i - j + 1);    
        }
    }
    return res == -1 ? -1 : n - res;
}
}
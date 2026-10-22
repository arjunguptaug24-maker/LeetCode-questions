class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int k = 0;                       // index of 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                k = i;
                break;
            }
        }

        boolean inc = true, dec = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] != (nums[i - 1] + 1) % n) inc = false;
            if (nums[i] != (nums[i - 1] - 1 + n) % n) dec = false;
        }

        int ans = Integer.MAX_VALUE;

        if (inc) {
            ans = Math.min(ans, k);              // rotate left k times
            ans = Math.min(ans, n - k + 2);      // reverse, rotate n-k, reverse
        }
        if (dec) {
            ans = Math.min(ans, n - k);              // reverse, then rotate n-1-k times
            ans = Math.min(ans, (k + 1) % n + 1);    // rotate k+1 times, then reverse
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
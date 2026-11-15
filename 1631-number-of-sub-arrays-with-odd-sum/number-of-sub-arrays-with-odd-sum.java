
class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        long even = 1, odd = 0, ans = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
            ans %= mod;
        }
        return (int) ans;
    }
}
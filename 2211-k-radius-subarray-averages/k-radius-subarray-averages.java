class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for (int x = 0; x < nums.length; x++) {
            arr[x] = -1;
        }
        int window = 2 * k + 1;
        if (window > nums.length) {
            return arr;
        }
        int a = k;
        long sum = 0;
        int average = 0;
        for (int j = 0; j < window; j++) {
            sum += nums[j];
        }
        average = (int)(sum / window);
        arr[a] = average;
        a++;
        for (int c = 1; c < nums.length - 2 * k; c++) {
            sum -= nums[c - 1];
            sum += nums[c + 2 * k];
            average = (int)(sum / window);
            arr[a] = average;
            a++;
        }
        return arr;
    }
}
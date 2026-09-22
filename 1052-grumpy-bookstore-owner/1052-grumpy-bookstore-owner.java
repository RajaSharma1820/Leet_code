class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int total = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                total += customers[i];
            }
        }
        int window = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                window += customers[i];
            }
        }
        int maxWindow = window;
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                window += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                window -= customers[i - minutes];
            }
            maxWindow = Math.max(maxWindow, window);
        }
        return total + maxWindow;
    }
}
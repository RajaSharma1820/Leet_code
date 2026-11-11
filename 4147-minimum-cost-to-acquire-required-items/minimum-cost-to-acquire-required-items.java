class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long mn = Math.min(need1, need2);
        long mx = Math.max(need1, need2);
        long ans1 = (long) need1 * cost1 + (long) need2 * cost2;
        long ans2 = mn * costBoth + (long) (need1 - mn) * cost1 + (long) (need2 - mn) * cost2;
        long ans3 = mx * costBoth;
        return Math.min(ans1, Math.min(ans2, ans3));
    }
}
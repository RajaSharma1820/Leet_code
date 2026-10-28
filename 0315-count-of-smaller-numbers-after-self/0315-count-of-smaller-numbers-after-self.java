
import java.util.*;
class Solution {
    int[] count;
    int[] index;
    int[] temp;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        index = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        merge(nums, 0, n - 1);
        List<Integer> ans = new ArrayList<>();
        for (int x : count) {
            ans.add(x);
        }
        return ans;
    }

    public void merge(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;

        merge(nums, left, mid);
        merge(nums, mid + 1, right);

        mrgsort(nums, left, mid, right);
    }
    public void mrgsort(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int smaller = 0;
        while (i <= mid && j <= right) {
            if (nums[index[j]] < nums[index[i]]) {
                temp[k++] = index[j++];
                smaller++;
            } else {
                count[index[i]] += smaller;
                temp[k++] = index[i++];
            }
        }
        while (i <= mid) {
            count[index[i]] += smaller;
            temp[k++] = index[i++];
        }
        while (j <= right) {
            temp[k++] = index[j++];
        }
        for (int p = left; p <= right; p++) {
            index[p] = temp[p];
        }
    }
}
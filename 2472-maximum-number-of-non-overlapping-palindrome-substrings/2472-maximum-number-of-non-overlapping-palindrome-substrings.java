class Solution {
    public int maxPalindromes(String s, int k) {
        int count = 0;
        int i = 0;
        while (i <= s.length() - k) {
            if (palindrome(s, i, i + k - 1)) {
                count++;
                i = i + k;
            }
            else if (i + k < s.length() &&
                     palindrome(s, i, i + k)) {
                count++;
                i = i + k + 1;
            }
            else {
                i++;
            }
        }
        return count;
    }
    public boolean palindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
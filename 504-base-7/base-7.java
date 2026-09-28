class Solution {
    public String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;

        if (negative) {
            num = -num;
        }

        StringBuilder ans = new StringBuilder();

        while (num > 0) {
            int remainder = num % 7;
            ans.append(remainder);
            num = num / 7;
        }

        if (negative) {
            ans.append("-");
        }

        return ans.reverse().toString();
    }
}
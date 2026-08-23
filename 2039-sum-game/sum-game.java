class Solution {
    public boolean sumGame(String num) {
        int mid = num.length() / 2;
        int leftsum = 0;
        int rightsum = 0;
        int Quesleft = 0;
        int Quesright = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i < mid) {
                if (num.charAt(i) == '?') {
                    Quesleft++;
                } else {
                    leftsum += num.charAt(i) - '0';
                }
            } else {
                if (num.charAt(i) == '?') {
                    Quesright++;
                } else {
                    rightsum += num.charAt(i) - '0';
                }
            }
        }
        if ((Quesleft + Quesright) % 2 != 0) {
            return true;
        }
        if (leftsum - rightsum
                == 9 * (Quesright - Quesleft) / 2) {
            return false;
        }
        return true;
    }
}
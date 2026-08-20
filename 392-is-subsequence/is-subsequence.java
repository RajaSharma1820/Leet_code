class Solution {
    public boolean isSubsequence(String s, String t) {
        String a = "";
        int j=0;
        for(int i=0;i<t.length()&&j<s.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                a+=t.charAt(i);
                j++;
            }
        }
        return a.equals(s);
    }
}
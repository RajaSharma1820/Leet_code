class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean a = true;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    a=false;
                    break;
                }
                }
                if(a){
                    return i;
            }
        }
        return -1;
    }
}
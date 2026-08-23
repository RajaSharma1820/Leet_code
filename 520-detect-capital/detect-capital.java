class Solution {
    public boolean detectCapitalUse(String word) {
        int capital  =0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capital++;
            }
        }
        if(capital==0 || capital==word.length()){
            return true;
        }
        if(capital==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char ar[] = new char[26];
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
            ar[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ar[i]!=0){
                return false;
            }
        }
        return true;
    }
}
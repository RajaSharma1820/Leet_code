class Solution {
    public String truncateSentence(String s, int k) {
        char[] ch = s.toCharArray();
        int count =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                count++;
                if(count==k){
                    return s.substring(0,i);
                }
            }

        }
        return s;
    }
}
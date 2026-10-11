class Solution {
    public int maxVowels(String s, int k) {
      int count =0;
      int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
                max = count;
        for(int i=1;i<=s.length()-k;i++){
            char a = s.charAt(i-1);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                count--;
            }
            char b = s.charAt(i+k-1);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                count++;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
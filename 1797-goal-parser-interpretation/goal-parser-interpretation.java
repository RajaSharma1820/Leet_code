class Solution {
    public String interpret(String command) {
        char[] arr = command.toCharArray();
        String s ="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='G'){
                s+='G';
            }
            else if(arr[i]=='(' && arr[i+1]==')'){
                s+='o';
            }
            else if(arr[i]=='(') {
                s+="al";
                
            }
        }
        return s;
    }
}
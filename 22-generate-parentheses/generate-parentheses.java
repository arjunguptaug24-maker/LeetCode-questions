

class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder("");
        List<String> result = new ArrayList<>();
        answer(sb,n,0,0,result);
        return result;

    }
    private void answer(StringBuilder sb ,int n ,int open ,int close , List<String> result  ){
           if(sb.length() == 2*n ){
            String s = sb.toString();
            if(IsValidString(s)){
                result.add(s);
                return ;
            
           }
           }

          if(open<n){
            sb.append('(');
            answer(sb,n,open+1,close,result);
            sb.deleteCharAt(sb.length() -1);
          }
          if(close<n){
            sb.append(')');
            answer(sb,n,open,close+1,result);
            sb.deleteCharAt(sb.length() -1);
          }

    }
    private boolean IsValidString(String sb){

        int count = 0 ;
        for(int i = 0 ; i<sb.length() ;i++){
            if(sb.charAt(i) == '('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                return false;
            }



        }
        
            return true;

    }
}



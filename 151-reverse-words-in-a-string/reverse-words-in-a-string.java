class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder reverse = new StringBuilder("");
        for(int i = s.length()-1;i>=0 ;i--){
            while(s.charAt(i) != ' ' && i>=0){
                sb.append(s.charAt(i));
                if(i== 0 ){
                    break;
                }
                
                i--;
                
            }
            
            if(sb.length()>0 ){
                reverse.append(sb.reverse() +" ");
                sb.setLength(0);
                
            }

            
        }
        return reverse.substring(0,reverse.length()-1);
        
    }
}
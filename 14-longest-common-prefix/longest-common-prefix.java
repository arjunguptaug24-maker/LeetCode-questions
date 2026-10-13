class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l  = strs[0].length();
        StringBuilder sb = new StringBuilder();
        boolean result = true;
        for(int i = 0  ; i<l ;i++){
            for(int j = 1 ; j<strs.length; j++){
                int length = strs[j].length();
                if(i == length){
                    result = false;
                    break;
                }

                if(strs[j-1].charAt(i) != strs[j].charAt(i)){
                    result = false;
                    break;
                    
                }

            }
            if(result == false){
                break;
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
        
    }
}
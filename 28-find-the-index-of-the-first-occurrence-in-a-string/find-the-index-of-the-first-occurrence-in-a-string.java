class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(needle.equals(haystack)){
            return 0;
        }
        for(int i = 0 ; i<=haystack.length() - needle.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 1 ;
                boolean result = true;
                
                while(j<needle.length()){
                    if(haystack.charAt(i+j) !=needle.charAt(j)){
                        result = false;
                        break;
                    } 
                    
                    j++;
                }
                if(result){
                    return i;
                }
            }

        }
        return -1;

    }
}
class Solution {
    public int beautySum(String s) {
        int total = 0;
        for(int i = 0 ; i<s.length();i++){
            int[] freq = new int[26];
            

            for(int j = i ;j<s.length();j++){
                freq[s.charAt(j) - 'a'] = freq[s.charAt(j) -'a'] +1;
            int min = Integer.MAX_VALUE;
            int max = 0 ;

  

                for(int f = 0 ;f<26; f++){
                    if(freq[f]!=0){
                    max = Math.max(max,freq[f]);
                    min = Math.min(min,freq[f]);
                    }
              }
                if(max-min>0){
                    total = total+ max-min;
                }
            }
        }
        return total;      
    }
}
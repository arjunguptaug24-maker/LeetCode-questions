class Solution {
    public List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        
        partition(result,curr,s,0);
        return result;

        
    }
    public void partition(List<List<String>> result , List<String> curr , String s , int start ){
        if(start == s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int end = start+1; end<=s.length() ; end++){
            String sb =s.substring(start,end);
            if(isValidPalindrome(sb)){
                curr.add(sb);
                partition(result,curr,s,end);
                curr.remove(curr.size() -1);
            } 
        }

        
    }
    public boolean isValidPalindrome(String s ){
        int i = 0 ;
        int n = s.length();
        while(i<n/2){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
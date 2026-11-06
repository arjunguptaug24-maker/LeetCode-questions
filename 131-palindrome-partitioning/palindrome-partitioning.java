import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        partition(result,curr,0,s);
        return result;


    }
    public void partition(List<List<String>> result , List<String> curr , int start , String s ){
        if(start == s.length()){
            result.add(new ArrayList<>(curr));
            return ;
        }
        for(int end = start+1 ; end<=s.length() ;end++){
            String sb = s.substring(start,end);
            if(isvalidpalindrome(sb)){
                curr.add(sb);
                partition(result,curr,end,s);
                curr.remove(curr.size()-1);
            }
        }

    }
    public boolean isvalidpalindrome(String s){
        int n = s.length();
        for(int i = 0 ; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    
}
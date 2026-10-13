class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] temp = new char[128];
        char[] temp2 = new char[128];
        int l = s.length();
        for(int i = 0 ; i<l; i++){
            if(temp[s.charAt(i)] == 0&& temp2[t.charAt(i)] == 'a' ){
                return false;
            }
            if(temp[s.charAt(i)]!=0 && temp[s.charAt(i)] != t.charAt(i)){
                return false; 
            }
            temp[s.charAt(i)] = t.charAt(i);
            temp2[t.charAt(i)] = 'a';

             
        }
        return true;

    }
}
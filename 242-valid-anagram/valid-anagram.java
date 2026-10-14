import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] temp1 = new int[128];
        int[] temp2 = new int[128];
        if(s.length()!= t.length()){
            return false;
        }
        for(int i = 0 ; i<s.length() ; i++){
            temp1[s.charAt(i)] = temp1[s.charAt(i)] +1;
            temp2[t.charAt(i)]= temp2[t.charAt(i)] +1;


        }
        if(Arrays.equals(temp1,temp2)){
            return true;
        }
        return false;
    }
}
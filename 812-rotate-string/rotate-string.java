import java.util.Arrays;
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()){
            return false;
        }
        char[] g = goal.toCharArray();
        char[] arr = s.toCharArray();
        int l = s.length();
        for(int i = 0 ; i<s.length();i++){
            char temp = arr[0];
            for(int j = 0 ; j<s.length()-1; j++){
                  arr[j] = arr[j+1];

            }
            arr[l-1] = temp;
            if(Arrays.equals(g,arr)){
                return true;
            }

        }
        return false;
    }
}
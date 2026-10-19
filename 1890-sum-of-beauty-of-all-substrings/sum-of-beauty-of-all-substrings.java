import java.util.*;
class Solution {
    public int beautySum(String s) {
        int total = 0;
        for(int i = 0 ; i<s.length(); i++){

            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i; j<s.length() ; j++){
                map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) + 1);
                int max= 0;
                int min = Integer.MAX_VALUE;
                for(int value : map.values()){
                    if(value!=0){
                        max= Math.max(max,value);
                        min = Math.min(min,value);
                    }
                }
                if(max-min>0){
                total += max-min;
                }
            }
        }
        return total;

    }
}
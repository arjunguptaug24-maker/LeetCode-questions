import java.util.*;

class Solution {
    public String frequencySort(String s) {

        int[] map = new int[62];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                map[ch - 'A']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                map[26 + (ch - 'a')]++;
            }
            else if (ch >= '0' && ch <= '9') {
                map[52 + (ch - '0')]++;
            }
        }

        StringBuilder sb = new StringBuilder();

        // Find maximum repeatedly
        for (int k = 0; k < 62; k++) {

            int max = 0;
            int index = -1;

            for (int i = 0; i < 62; i++) {
                if (map[i] > max) {
                    max = map[i];
                    index = i;
                }
            }

            if (max == 0) {
                break;
            }

            char ch;

            // Convert index back to character
            if (index < 26) {
                ch = (char) ('A' + index);
            }
            else if (index < 52) {
                ch = (char) ('a' + (index - 26));
            }
            else {
                ch = (char) ('0' + (index - 52));
            }

            // Append character max times
            for (int j = 0; j < max; j++) {
                sb.append(ch);
            }

            // Mark as processed
            map[index] = 0;
        }

        return sb.toString();
    }
}
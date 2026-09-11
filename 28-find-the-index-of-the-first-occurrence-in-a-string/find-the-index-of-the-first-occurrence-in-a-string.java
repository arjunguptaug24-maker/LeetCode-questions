class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                boolean result = true;
                int j = 1;

                while (j < needle.length()) {

                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        result = false;
                        break;
                    }

                    j++;
                }

                if (result) {
                    return i;
                }
            }
        }

        return -1;
    }
}
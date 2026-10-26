

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        answer(sb, n, 0, 0, result);

        return result;
    }

    private void answer(StringBuilder sb, int n, int open, int close,
                        List<String> result) {

        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append('(');
            answer(sb, n, open + 1, close, result);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            answer(sb, n, open, close + 1, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}



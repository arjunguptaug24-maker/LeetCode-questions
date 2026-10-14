class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Character>[] buckets = new List[s.length() + 1];
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            int f = e.getValue();
            if (buckets[f] == null) buckets[f] = new ArrayList<>();
            buckets[f].add(e.getKey());
        }

        StringBuilder sb = new StringBuilder();
        for (int f = s.length(); f > 0; f--) {
            if (buckets[f] != null) {
                for (char c : buckets[f]) {
                    for (int i = 0; i < f; i++) sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
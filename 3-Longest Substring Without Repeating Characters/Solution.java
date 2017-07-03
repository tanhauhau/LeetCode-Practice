public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = -1;
        int longest = 0;
        for(int j=0; j<s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                start = Math.max(start, map.get(s.charAt(j)));
            }
			longest = Math.max(longest, j - start);
            map.put(s.charAt(j), j);
        }
        return longest;
    }
}

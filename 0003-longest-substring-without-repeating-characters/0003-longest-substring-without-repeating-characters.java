class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0; right<s.length(); right++){
            while(!set.add(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int max=0;
        for(int end = 0; end<s.length(); end++){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                max=Math.max(max,end-start+1);
            }else{
                while(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(s.charAt(end));
            }
        }
        return max;
    }
}
class Solution {
    int start=0, length=0;
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            longestPalindromeHelper(i, i, s);
            longestPalindromeHelper(i, i+1, s);
        }
        return s.substring(start, start+length);
        
    }
    
    public void longestPalindromeHelper(int j, int k, String s){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(length < k-j-1){
            start=j+1;
            length=k-j-1;
        }
    }
}
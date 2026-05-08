class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length()-1; i++) {
            int size = Math.max(expand(i,i,s), expand(i,i+1,s));
            if(max < size) {
                max = size;
                start = i - (size - 1) / 2;
                end = i + size / 2;
            }
        }

        return s.substring(start, end+1);
    }

    public int expand(int left, int right, String s){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
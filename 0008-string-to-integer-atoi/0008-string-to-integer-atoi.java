class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) return 0;

        boolean negative = false;
        if(s.charAt(0)== '-') {
            negative = true;
            s = s.substring(1);
        } else if (s.charAt(0)== '+') {
            s = s.substring(1);
        }

        int result  = 0;
        int i = 0;
        while (i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return negative? Integer.MIN_VALUE : Integer.MAX_VALUE;

            result = result * 10 + digit;
            i++;
        }
        return  negative? -result : result;
    }
}
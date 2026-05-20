class Solution {
    public String intToRoman(int num) {
        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        String[] romans = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num != 0) {
            int a = num / values[i];

            for (int j = 0; j < a; j++) {
                sb.append(romans[i]);
            }
            
            num %= values[i];
            i++;
        }
        return sb.toString();
    }
}
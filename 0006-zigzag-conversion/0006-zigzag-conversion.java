import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
       List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int row = 0;
        int dir = 1;

        for (char c : s.toCharArray()){
            rows.get(row).append(c);

            if(row == 0) {
                dir = 1;
            } else if (row == numRows-1) {
                dir = -1;
            }

            row += dir;
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder st : rows){
            sb.append(st);
        }
        return sb.toString();
    }
}
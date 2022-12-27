// 문자열 정렬하기 (2)

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        
        char[] ordered = my_string.toCharArray();
        
        Arrays.sort(ordered);
        
        answer = new String(ordered);
        return answer;
    }
}
// 문자열 정렬하기(1)

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[intStr.length()];
        for(int i = 0; i < intStr.length(); i++) {
            char intChar = intStr.charAt(i);
            answer[i] += (int) intChar - 48;
        }
        Arrays.sort(answer);
        return answer;
    }
}
// A로 B 만들기

import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 2;

        String[] beArr = new String[before.length()];
        String[] afArr = new String[after.length()];
        
        beArr = before.split("");
        afArr = after.split("");
        
        Arrays.sort(beArr);
        Arrays.sort(afArr);
        
        String newBefore = Arrays.toString(beArr);
        String newAfter = Arrays.toString(afArr);
        
        if (newBefore.equals(newAfter)) {
            answer = 1;
        }
        else { answer = 0; }
        return answer;
    }
}
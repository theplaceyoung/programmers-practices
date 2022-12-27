// 편지

class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] strArray = message.split("");
        
        answer = strArray.length * 2;
        return answer;
    }
}
// 세균 증식

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int diff = (int)Math.pow(2, t);
        answer = diff * n;
        return answer;
    }
}

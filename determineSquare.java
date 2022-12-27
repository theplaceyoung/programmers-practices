// 제곱수 판별하기

class Solution {
    public int solution(int n) {
        int answer = 0;
        if ((n >= 1) && (n <= 1000000)) {
            for (int i = 1; i <= 1000; i++) {
                if (i * i == n) { answer = 1; break; }
                answer = 2;
            }
        }
        return answer;
    }
}
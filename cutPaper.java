// 종이 자르기

class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        if (M <= N) {
            answer = (M-1) + M*(N-1); 
            }
        else {
            answer = (N-1) + N*(M-1); 
            }
        
        return answer;
    }
}
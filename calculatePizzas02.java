// 피자 나눠 먹기 (2)

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i < 600; i ++){
            if((6 * i) % n == 0) { 
                answer = i; 
                break;
            }
        }
        return answer;
    }
}
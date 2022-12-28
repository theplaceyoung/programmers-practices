// 팩토리얼

class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i = 2; i < 12; i++) {
            factorial *= i;
            if(factorial > n) { answer = i-1 ; break; }
        }
        return answer;
    }
}

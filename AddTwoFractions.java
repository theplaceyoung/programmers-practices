// 분수의 덧셈

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numerN = numer1 * denom2 + numer2 * denom1;
        int denomN = denom1 * denom2;
// (numer1 * denom2 + numer2 * denom1) / demon1 * denom2
        for(int i = 1; i < denomN; i++){
            if((numerN % i == 0) && (denomN % i == 0)){
                answer[0] = numerN / i;
                answer[1] = denomN / i;  
            }
        }
        return answer;
    }
}
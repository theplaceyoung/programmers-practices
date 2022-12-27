// 짝수는 싫어요

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        switch(n%2) {
            case 0 : 
                answer = new int[n/2];
                for(int i = 0; i < n/2; i++) {
                    answer[i] = 2 * i + 1;
                }
                break;
            case 1 :
                answer = new int[n/2+1];
                for(int i = 0; i < n/2 + 1; i++){
                    answer[i] = 2 * i + 1;
                }
                break;
        }
        return answer;
    }
}
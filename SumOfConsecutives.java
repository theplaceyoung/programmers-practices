// 연속된 수의 합

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int a = total/num - (num - 1)/2; // a is the 1st one!
        
        for (int i = 0; i <= (num - 1); i++) {
            answer[i] = a + i;
        }   
        
        return answer;
    }
}

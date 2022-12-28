// 짝수 홀수 개수

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int length = num_list.length;
        int even = 0;
        int odd = 0;
        if ((length >= 1) && (length <= 100)) {
            for (int num : num_list) {
                if ((num >= 0) && (num <= 1000)) {
                    if(num%2 == 0) { even++; }
                    else { odd++; } 
                    }
                
                
                }
            answer[0] = even;
            answer[1] = odd;
            }
        return answer;
    }
}

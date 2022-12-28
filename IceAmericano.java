// 아이스 아메리카노 

class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        if ((money > 0) && (money <= 1000000)) {
            int glass = (int)(money / 5500);
            int change = money - glass * 5500;
            
            answer[0] = glass;
            answer[1] = change;
          
        }
        return answer;
    }
}

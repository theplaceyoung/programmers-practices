// 개미 군단

class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int king = hp / 5;
        int queen = (hp % 5) / 3;
        int joker = (hp % 5) % 3;
        
        answer = king + queen + joker;
        return answer;
    }
}
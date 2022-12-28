// 369게임

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String clap = Integer.toString(order);
        clap = clap.replaceAll("[^369]","");
        
        answer = clap.length(); 
        return answer;
    }
}

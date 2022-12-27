// 잘라서 배열로 저장하기

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = my_str.split("(?<=\\G.{" + n + "})");
        
        return answer;
    }
}
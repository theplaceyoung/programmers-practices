// 숨어있는 숫자의 덧셈(1)

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str_string = my_string.replaceAll("[^0-9]", "");
        String[] strArray = str_string.split("");
        
        for (String str : strArray) {
            answer += Integer.parseInt(str);
            
        }
       
        return answer;
    }
}

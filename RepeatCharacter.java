// 문자 반복 출력하기

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // char[] repeatCha = new char[my_string.length()];
        char[] repeatCha = my_string.toCharArray();
        
        for(char rep: repeatCha) {
            answer += String.valueOf(rep).repeat(n);
            }
        return answer;
    }
}

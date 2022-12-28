// 인덱스 바꾸기

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer += b;
            }
            else if(i == num2) {
                answer += a;
            }
            else {answer += my_string.charAt(i);}
            
        }
        
        return answer;
    }
}

// 대문자와 소문자

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // char c = my_string.charAt(i);
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(65 <= c && c <= 90){ 
                c += 32;
                answer += c;
                }
            else if(97 <= c && c <= 122){ 
                c -= 32;
                answer += c;
                }
            }
               
        return answer;
    }
}

// 가위 바위 보

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        answer = rsp
            .replace("2","3")
            .replace("0","1")
            .replace("5","6")
            .replace("3","0")
            .replace("1","5")
            .replace("6","2");
        
        
        
        return answer;
    }
}
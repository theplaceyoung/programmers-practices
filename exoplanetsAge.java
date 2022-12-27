// 외계행성의 나이

class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = Integer.toString(age);
        answer = strAge.replaceAll("0", "a")
            .replaceAll("1", "b")
            .replaceAll("2", "c")
            .replaceAll("3", "d")
            .replaceAll("4", "e")
            .replaceAll("5", "f")
            .replaceAll("6", "g")
            .replaceAll("7", "h")
            .replaceAll("8", "i")
            .replaceAll("9", "j");
        
        return answer;
    }
}
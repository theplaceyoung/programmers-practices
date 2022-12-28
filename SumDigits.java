// 자릿수 더하기

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String intStr = Integer.toString(n);
        // String[] intStrArray = new String[intStr.length()];
        
        //for (String str : intStrArray) {
        char[] charArr = new char[intStr.length()];
        
        for (int i = 0; i < charArr.length; i++){
            charArr[i] = intStr.charAt(i); }
        
        for(char cha : charArr) {
            answer += (int) cha - 48;
        }
        
        
        
        // for (int i = 1; i < (int)(Math.log10(n)+2); i++) {
        //     answer += (n % (Math.pow(10, i))) / (Math.pow(10, i - 1));
        // }
        return answer;
    }
}

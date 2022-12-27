// 이진수 더하기

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int i = Integer.parseInt(bin1, 2);
        int j = Integer.parseInt(bin2, 2);
        
        int k = i + j;
        
        answer = Integer.toBinaryString(k);
        
        
        return answer;
    }
}
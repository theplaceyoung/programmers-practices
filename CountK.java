// K의 개수

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int a = i; a < j+1; a++){
            str += Integer.toString(a);
        }
        
        for(int b = 0; b < str.length(); b++) {
            if (str.charAt(b) == (char)(k + '0')) { answer++; }
        }
        
        return answer;
    }
}

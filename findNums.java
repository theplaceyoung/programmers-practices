// 숫자 찾기

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String intStr = Integer.toString(num);
        String[] intStrArr = intStr.split("");
        for(int i = 0; i < intStrArr.length; i++){
            if(intStrArr[i] == String.valueOf(k)){
                answer = i;
                break;
                }
            else {answer = -1;}
            }
        return answer;
    }
}
// 약수 구하기

class Solution {
    public int[] solution(int n) {
        String str = "";
        for(int i = 1; i < n+1; i++) {
            if(n % i == 0) {
                str += Integer.toString(i) + ",";
            }
        }
        String[] arrStr =str.split(",");
        
        int[] answer = new int[arrStr.length];
        for(int j = 0; j < arrStr.length; j++) {
            answer[j] = Integer.valueOf(arrStr[j]);
        }
        
        return answer;
    }
}

// 배열의 평균값

class Solution {
    public double solution(int[] numbers) {
        int length = numbers.length;
        int sum = 0;
        double answer = 0;
        
        if((length >= 1) && (length <= 100)) {
            for (int num : numbers) {
                if ((num >= 0) && (num <= 1000)) {
                    sum += num; 
                }
                answer = (double)sum / length;
            }
        }
        return answer;
    }
}
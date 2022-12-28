// 배열 두 배 만들기

class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] answer = new int[length];
        if ((length >= 1) && (length <= 1000)) {
            for (int num : numbers) {
               if ((num >= -10000)&&(num <= 10000)) {
                   for (int i = 0; i < length; i++) {
                       answer[i] = 2 * numbers[i];
               } 
            }
            }
        }
        return answer;
    }
}

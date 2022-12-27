// 최댓값 만들기(1)

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        
        
//         int[][] integers = new int[(numbers.length)][(numbers.length)];
        
//         for(int i = 0; i < numbers.length; i++) {
//             for(int j = 0; j < numbers.length; j++) {
//                 integers[i][j] = numbers[i] * numbers[j];
//             }
//         }
//         for(int k = 0; k < numbers.length; k++) {
//                 integers[k][k] = -1;
//             }    
//         answer = integers[0][1];
//         for(int[] nums : integers) {
//             for(int num : nums) {
//                 if(num >= answer) {
//                     answer = num;
//                 }
//             }
//         }
        return answer;
    }
}
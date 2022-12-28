// 최댓값 만들기 (2)

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = -1;
        int b = 1;
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        if(numbers.length == 1) {
            answer = numbers[0];
        }
        
        else {
            if (numbers.length >= 2){
                a = numbers[0] * numbers[1];
                b = numbers[numbers.length-1] * numbers[numbers.length-2];
                
                if(a>b){ answer = a; }
                else{ answer = b; }
            }
        }
        return answer;
    }
}

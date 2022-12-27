// 7의 개수

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] arr = new String[array.length];
        
        for(int i = 0; i < array.length; i++){
            arr[i] = String.valueOf(array[i]);    
        }
        
        String str = Arrays.toString(arr);
        str = str.replaceAll("[^7]", "");
        answer = str.length();
        
        return answer;
    }
}
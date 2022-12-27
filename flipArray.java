// 배열 뒤집기

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        if((length >= 1) && (length <= 1000)) {
            for (int num : num_list) {
                if((num >= 0) && (num <= 1000)) {
                    for(int i = 0; i < length ; i++) {
                        answer[i] = num_list[length - 1 - i];
                    }        
                }
            }
        }
        return answer;
    }
}
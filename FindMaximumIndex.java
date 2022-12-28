// 가장 큰 수 찾기

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= max) {
                max = ((array[i] > max) ? array[i] : max);
                count = i;
                }
            }
        answer[0] = max;
        answer[1] = count;
        return answer;
    }
}

// 중복된 숫자 개수

class Solution {
    public int solution(int[] array, int n) {
        int length = array.length;
        int answer = 0;
        
        if((length >= 1) &&(length <= 100)) {
            for(int arr : array) {
                if ((arr >= 0) && (arr <= 1000)) {
                    if(arr == n) {answer ++;}
                } 
            }
        }
        return answer;
    }
}

// 양꼬치

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(((n > 0) && (n < 1000)) && ((k >= n/10) && (k < 1000))) {
            answer = n * 12000 + (k - (int)(n/10)) * 2000; 
        }
        return answer;
    }
}
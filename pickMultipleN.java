// n의 배수 고르기

class Solution {
    public int[] solution(int n, int[] numlist){
        int count = 0;
        for(int num : numlist){
            if(num % n == 0) { count++; }
        }
            
        int[] answer = new int[count]; 
        for(int i = 0, k = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0) {
                answer[k] = numlist[i];
                k++;
                
            }
        }
     
        return answer;
    }
}
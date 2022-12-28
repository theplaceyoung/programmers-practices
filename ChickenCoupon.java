// 치킨 쿠폰

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(coupon > 9){
            answer += coupon / 10; 
            coupon = coupon / 10 + coupon % 10;
            continue;
        }
        
        return answer;
    }
}

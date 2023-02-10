// 분수의 덧셈

function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    answer.push(numer1 * denom2 + numer2 * denom1, denom1 * denom2);
    for(var i = 1; i <= denom1 * denom2; i++){
        if((answer[0] % i == 0) && (answer[1] % i == 0)){
            answer.map(function(x){return answer.push(x/i)});
        }
        answer = answer.slice(answer.length -2);
    }
    return answer;
}
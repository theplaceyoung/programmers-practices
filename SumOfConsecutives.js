// 연속된 수의 합

function solution(num, total) {
    var answer = [];
    if(total % num == 0){
        for(var j = 0; j < num; j++){
            answer.push(Math.floor(total / num) - Math.floor(num/2) + j);
        }
    }
    else{
        for(var i = 0; i < num; i++){
            answer.push(Math.floor(total / num) - Math.floor(num/2) + i + 1);    
        }
    }
    return answer;
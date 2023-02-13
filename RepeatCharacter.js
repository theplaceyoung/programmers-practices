// 문자 반복 출력하기 

function solution(my_string, n) {
    var answer = '';
    for(var i = 0; i < my_string.length; i++){
        answer += my_string.charAt(i).repeat(n);
    }
    return answer;
}
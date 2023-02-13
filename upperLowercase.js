// 대문자와 소문자

function solution(my_string) {
    var answer = '';
    for(var i = 0; i < my_string.length; i++){
        if(my_string.charAt(i) === my_string.charAt(i).toLowerCase()){
            answer += my_string.charAt(i).toUpperCase();
    }
        else if(my_string.charAt(i) === my_string.charAt(i).toUpperCase()){
            answer += my_string.charAt(i).toLowerCase();
        }
    }
    return answer;
}
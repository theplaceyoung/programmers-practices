// 모음 제거

function solution(my_string) {
    var answer = '';
    answer = my_string.replace(/a/gi, "")
        .replace(/e/gi, "")
        .replace(/i/gi, "")
        .replace(/o/gi, "")
        .replace(/u/gi, "");
    return answer;
}
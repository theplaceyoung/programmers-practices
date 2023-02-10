// 짝수 홀수 개수

function solution(num_list) {
    var answer = [];
    answer[0] = num_list.filter(num_list => num_list%2 == 0).length;
    answer[1] = num_list.filter(num_list => num_list%2 !== 0).length;
    return answer;
}
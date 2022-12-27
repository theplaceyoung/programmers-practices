// 영어가 싫어요

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        numbers = numbers.replaceAll("zero", "0")
                         .replaceAll("one", "1")
                         .replaceAll("two", "2")
                         .replaceAll("three", "3")
                         .replaceAll("four", "4")
                         .replaceAll("five", "5")
                         .replaceAll("six", "6")
                         .replaceAll("seven", "7")
                         .replaceAll("eight", "8")
                         .replaceAll("nine", "9");
        
//         number = numbers.replaceAll("zero", "0");
//         number = numbers.replaceAll("one", "1");
//         number = numbers.replaceAll("two", "2");
//         number = numbers.replaceAll("three", "3");
//         number = numbers.replaceAll("four", "4");
//         number = numbers.replaceAll("five", "5");
//         number = numbers.replaceAll("six", "6");
//         number = numbers.replaceAll("seven", "7");
//         number = numbers.replaceAll("eight", "8");
//         number = numbers.replaceAll("nine", "9");
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}
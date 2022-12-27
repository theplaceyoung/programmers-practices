// 직각삼각형 출력하기

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str.append("*");
            System.out.println(str);
        }
    }
}
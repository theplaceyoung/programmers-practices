// 평행

class Solution {
    public int solution(int[][] dots) {
        int answer = -1;
        
        int a1 = (dots[0][1]-dots[1][1])*(dots[2][0]-dots[3][0]);
        int a2 = (dots[2][1]-dots[3][1])*(dots[0][0]-dots[1][0]);
        
        int b1 = (dots[0][1]-dots[2][1])*(dots[1][0]-dots[3][0]);
        int b2 = (dots[1][1]-dots[3][1])*(dots[0][0]-dots[2][0]);
        
        int c1 = (dots[0][1]-dots[3][1])*(dots[1][0]-dots[2][0]);      
        int c2 = (dots[1][1]-dots[2][1])*(dots[0][0]-dots[3][0]);
        
        
        if(a1==a2){answer = 1;}
        else if(b1==b2){answer = 1;}
        else if(c1==c2){answer = 1;}
        else {answer = 0;}
        
        return answer;
    }
}

//  double a1 = (dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0]);
//         double a2 = (dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0]);
        
//         double b1 = (dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0]);
//         double b2 = (dots[1][1]-dots[3][1])/(dots[1][0]-dots[3][0]);
        
//         double c1 = (dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0]);    
//         double c2 = (dots[1][1]-dots[2][1])/(dots[1][0]-dots[2][0]);   
        

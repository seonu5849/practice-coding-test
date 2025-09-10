import java.lang.Math;
class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int num = x;
        int sum = 0;
        
        // 자릿수의 합
        while(x > 0) {
            sum = sum + (x % 10);
            x /= 10;
        }
        
        // 자연수 % 자릿수의 합의 나머지가 0일때 true
        if(num % sum == 0) {
            answer = true;
        }
        
        
        return answer;
    }
}
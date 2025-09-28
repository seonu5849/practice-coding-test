class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            // 빈병을 가져다 주는 개수
            int receive = (n / a) * b;
            
            // 빈병을 가져다 준 후 받는 개수
            answer += receive;
            
            // 가져다 주고, 받은 개수 + 남은 개수
            n = receive + (n % a);
        }
        
        return answer;
    }
}
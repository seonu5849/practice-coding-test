class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++) {
            int divisors = numberOfDivisors(i); // 약수들의 개수
            answer += i * (divisors % 2 == 0 ? 1 : -1); // 짝수면 +, 홀수면 -
        }
        
        return answer;
    }
    
    // 약수들의 개수를 구하는 메소드
    public int numberOfDivisors(int number) {
        int cnt = 0;
        for(int i=1; i<=number; i++) {
            if(number % i == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
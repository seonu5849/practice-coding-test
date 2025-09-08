class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 약수는 자신을 제외하고 제일 큰 수는 자신/2이다.
        // 따라서 n을 2로 나눈 몫만큼만 반복하면 된다.
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) answer += i;
        }
        
        return answer + n;
    }
}
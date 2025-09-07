class Solution {
    public int solution(int n) {
        int answer = 1;
        
        // n % answer을 하여, 1이 아닐 경우엔 answer를 증가시키고
        // 1인 경우엔 while문이 작동하지 않도록 한다.
        while(n % answer != 1) {
            answer ++;
        }
        
        return answer;
    }
}
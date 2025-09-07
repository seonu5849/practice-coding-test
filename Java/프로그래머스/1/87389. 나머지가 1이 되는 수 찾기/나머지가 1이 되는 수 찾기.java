class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean flag = false;
        for(int i = 2; i<n; i++) {
            if(flag) {
                return answer;
            }
            
            if(n % i == 1) {
                answer = i;
                flag = true;
            }
        }
        
        return answer;
    }
}
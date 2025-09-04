class Solution {
    public int[] solution(long n) {
        int len = String.valueOf(n).length();
        int[] answer = new int[len];
        int cnt = 0;
        
        while(n > 0) {
            answer[cnt++] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}
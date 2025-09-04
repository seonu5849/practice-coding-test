class Solution {
    public int[] solution(long n) {
        int len = String.valueOf(n).length();
        int[] answer = new int[len];
        
        for(long i=0; i<answer.length; i++) {
            answer[(int) i] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}
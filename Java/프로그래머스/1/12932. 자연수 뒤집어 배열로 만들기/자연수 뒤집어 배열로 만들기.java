class Solution {
    public int[] solution(long n) {
        int len = (""+n).length();
        int[] answer = new int[len];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}
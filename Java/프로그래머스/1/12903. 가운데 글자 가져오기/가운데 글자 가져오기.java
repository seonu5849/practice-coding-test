class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int division = len / 2;
        
        // 짝수라면 두글자 반환
        if(len % 2 == 0) {
            answer = s.substring(division - 1, division + 1);
        } else { // 홀수라면 한글자 반환
            answer = s.substring(division, division + 1);
        }
        
        
        return answer;
    }
}
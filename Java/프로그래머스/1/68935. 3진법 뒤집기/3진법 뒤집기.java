import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 3 진법
        String[] formation = Integer.toString(n, 3).split("");
        
        // 앞뒤 반전
        StringBuilder reverse = new StringBuilder();
        for(int i=formation.length-1; i>=0; i--) {
            reverse.append(formation[i]);
        }
        
        // 10진법으로 표현
        answer = Integer.parseInt(reverse.toString(), 3);
        
        return answer;
    }
}
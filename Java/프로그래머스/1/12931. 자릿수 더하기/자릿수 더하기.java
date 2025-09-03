import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] arrStr = String.valueOf(n).split("");
        for(String str : arrStr) {
            int num = Integer.parseInt(str);
            answer += num;
        }

        return answer;
    }
}
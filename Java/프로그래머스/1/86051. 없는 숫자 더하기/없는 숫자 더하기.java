import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int number : numbers) {
            list.add(number);
        }
        
        // 없는 숫자들의 합계 구하기
        for(int i=0; i<=9; i++) {
            if(!list.contains(i)) {
                answer += i;
            }
        }
        
        return answer;
    }
}
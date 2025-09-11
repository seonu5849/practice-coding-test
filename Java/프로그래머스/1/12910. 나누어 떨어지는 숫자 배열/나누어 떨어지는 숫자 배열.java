import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                            .filter(x -> x % divisor == 0) // 나누어 떨어지는 것만
                            .sorted() // 정렬
                            .toArray();
        
        // 나누어 떨어지지 않으면 -1
        if(answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}
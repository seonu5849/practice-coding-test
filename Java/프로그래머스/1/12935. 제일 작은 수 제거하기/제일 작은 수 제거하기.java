import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        // 초기 arr가 1인 경우
        if(arr.length == 1) {
            return new int[]{-1};
        }
        
        // 최소값 찾기
        int min = Arrays.stream(arr).min().getAsInt();
        
        // 최소값을 제외한 나머지를 반환
        answer = Arrays.stream(arr)
            .filter(x -> x != min)
            .toArray();
        
        return answer;
    }
}
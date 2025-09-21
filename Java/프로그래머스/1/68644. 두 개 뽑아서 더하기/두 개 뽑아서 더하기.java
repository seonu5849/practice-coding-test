import java.util.*;
import java.util.stream.*;

class Solution {
    Set<Integer> set = new TreeSet<>(); // 정렬
    boolean[] visited;
    
    public int[] solution(int[] numbers) {
        visited = new boolean[numbers.length];
        dfs(numbers, 0, 0);
        
        int size = 0;
        int[] answer = new int[set.size()];
        for(int num : set) {
            answer[size++] = num;
        }
        
        return answer;
    }
    
    void dfs(int[] numbers, int start, int depth) {
        if(depth == 2){ // 선택한 숫자를 더하기
            int sum = 0;
            for(int i = 0; i < numbers.length; i++){
                if(visited[i]){
                    sum += numbers[i];
                }
            }
            set.add(sum);
            return;
        }

        // 2개의 숫자 선택
        for(int i = start; i < numbers.length; i++){
            visited[i] = true;
            dfs(numbers, i + 1, depth + 1);
            visited[i] = false;
        }
    }
}
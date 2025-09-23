import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int n=0; n<commands.length; n++) {
            int i = commands[n][0] - 1;
            int j = commands[n][1];
            int k = commands[n][2] - 1;
            
            // 임시 저장 배열
            int[] temp = new int[j - i];
            int cnt = 0;
            for(int m=i; m<j; m++) {
                temp[cnt++] = array[m];
            }
            
            // 정렬
            Arrays.sort(temp);
            
            // k번째 수 넣기
            answer[n] = temp[k];
        }
        
        return answer;
    }
}
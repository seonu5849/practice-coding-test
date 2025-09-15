import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        // temp에 첫번째 값을 넣는다.
        // 계속 비교를 하면서 서로 다른 값을 만나면 temp의 값을 result에 넣는다.
        // 서로 다른 값은 temp에 저장한다.
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        int temp = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(temp != arr[i]) {
                sb.append(arr[i]);
                temp = arr[i];
            }
        }
        
        answer = new int[sb.length()];
        for(int i=0; i<sb.length(); i++) {
            answer[i] = sb.charAt(i) - '0';
        }

        return answer;
    }
}
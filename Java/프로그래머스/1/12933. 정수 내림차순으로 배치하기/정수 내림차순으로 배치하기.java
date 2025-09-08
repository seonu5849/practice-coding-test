import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        int[] A = new int[str.length()];
        
        // int 배열에 담아줌.
        for(int i=0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }
        
        // 선택정렬
        for(int i=0; i<str.length(); i++) {
            int max = i;
            // max값 찾기
            for(int j=i+1; j<str.length(); j++) {
                if(A[j] > A[max]) {
                    max = j;
                }
            }
            
            // A[i]가 A[max] 보다 작으면 A[max]를 앞으로 당김 (A[i]와 위치 바꿈.)
            if(A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        
        // 배열을 long 타입으로 이어주기
        for(int i=0; i<str.length(); i++) {
            answer = answer * 10 + A[i];
        }
        
        return answer;
    }
}
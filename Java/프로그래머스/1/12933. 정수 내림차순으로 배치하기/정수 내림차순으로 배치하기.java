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
        
        // 버블정렬
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(A[i] < A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        
        // 배열을 long 타입으로 이어주기
        for(int i=0; i<str.length(); i++) {
            answer = answer * 10 + A[i];
        }
        
        return answer;
    }
}
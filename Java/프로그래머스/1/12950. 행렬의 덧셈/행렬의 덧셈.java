import java.util.*;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 1. 결과 행렬의 크기를 올바르게 선언
        // (arr1의 행 개수 x arr2의 열 개수)
        int[][] answer = new int[arr1.length][arr2[0].length];

        // 2. 3중 반복문으로 계산
        // i: arr1의 행을 순회
        for (int i = 0; i < arr1.length; i++) {
            // j: arr2의 열을 순회
            for (int j = 0; j < arr2[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
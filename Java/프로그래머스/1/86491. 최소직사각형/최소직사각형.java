import java.lang.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int w = 0;
        int h = 0;
        for(int i=0; i<sizes.length; i++) {
            // 가로 길이 (큰 것들 중 큰수)
            int width = Math.max(sizes[i][0], sizes[i][1]);
            if(w < width) {
                w = width;
            }
            
            // 세로 길이 (작은 것들 중 큰수)
            int height = Math.min(sizes[i][0], sizes[i][1]);
            if(h < height) {
                h = height;
            }
        }
        
        answer = w * h;
        return answer;
    }
}
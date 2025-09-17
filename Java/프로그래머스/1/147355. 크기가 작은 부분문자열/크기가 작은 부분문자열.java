class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int tLen = t.length();
        int pLen = p.length();
        
        // p의 자리수 만큼 뽑기
        for(int i=0; i<tLen - pLen + 1; i++) {
            String str = t.substring(i, pLen + i);
            
            // p보다 작으면 answer 증가, int의 범위를 넘을 수 있으므로 long으로 변환
            if(Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}
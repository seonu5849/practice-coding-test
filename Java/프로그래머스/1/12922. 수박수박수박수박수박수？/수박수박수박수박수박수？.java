class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=1; i<=n; i++) {
            String str = i % 2 != 0 ? "수" : "박";
            answer.append(str);
        }
        
        return answer.toString();
    }
}
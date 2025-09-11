class Solution {
    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        
        answer.append("김서방은 ");
        for(int i=0; i<seoul.length; i++) {
            if("Kim".equals(seoul[i])) {
                answer.append(i);
            }
        }
        answer.append("에 있다");
        
        return answer.toString();
    }
}
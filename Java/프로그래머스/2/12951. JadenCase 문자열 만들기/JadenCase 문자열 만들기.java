class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirst = true;
        
        for(char c : s.toCharArray()) {
            // 공백인 경우 공백을 넣어주고, 다음 문자는 첫 문자이므로 true
            if(c == ' '){
                answer.append(" ");
                isFirst = true;
            } else {
                // 첫 문자인 경우 대문자로 변경해주고, 다음에 오는 문자는 첫문자가 아니므로 false
                if(isFirst) {
                    answer.append(Character.toUpperCase(c));
                    isFirst = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }   
            }
        }
        
        return answer.toString();
    }
}
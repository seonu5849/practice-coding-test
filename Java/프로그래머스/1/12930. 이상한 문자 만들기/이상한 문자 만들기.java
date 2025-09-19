class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int wordIndex = 0; // 단어 내의 인덱스를 세는 변수
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // 1. 문자가 공백일 경우
            if (c == ' ') {
                answer.append(" ");
                wordIndex = 0; // 단어 인덱스 초기화
                continue; // 아래 로직을 건너뛰고 다음 반복으로
            }

            // 2. 단어 내 인덱스가 짝수일 경우
            if (wordIndex % 2 == 0) {
                answer.append(Character.toUpperCase(c));
            // 3. 단어 내 인덱스가 홀수일 경우
            } else {
                answer.append(Character.toLowerCase(c));
            }
            
            wordIndex++;
        }
        
        return answer.toString();
    }
}
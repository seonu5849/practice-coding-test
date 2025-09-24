class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            // 1. 알파벳인 경우에만 암호화 로직 적용
            if (Character.isLetter(c)) {
                // 2. 대소문자에 따라 시작점('A' 또는 'a') 결정
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // 3. 문자를 0~25 사이의 숫자로 변환, n을 더하고, 26으로 나눈 나머지 계산 후 다시 문자로 변환
                c = (char) (base + (c - base + n) % 26);
            }
            answer.append(c);
        }
        
        return answer.toString();
    }
}
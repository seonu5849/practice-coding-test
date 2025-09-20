class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1; // 첫 문자는 앞에 문자가 없기 때문에 반드시 -1
        for(int i=s.length() - 1; i>=0; i--) {
            char c1 = s.charAt(i);
            
            for(int j=i-1; j>=0; j--) {
                char c2 = s.charAt(j);
                
                // 순회하면서 같은 값을 발견한 경우 index를 부여
                if(c1 == c2) {
                    answer[i] = i - j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}
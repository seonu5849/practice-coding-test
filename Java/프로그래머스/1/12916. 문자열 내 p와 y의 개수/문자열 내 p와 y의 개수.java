class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr = s.toUpperCase().split("");
        int p = 0;
        int y = 0;
        
        for(String str : arr) {
            if("P".equals(str)) {
                p++;
            } else if("Y".equals(str) ){
                y++;
            }
        }
        
        if(p != y) {
            answer = false;
        }
        
        return answer;
    }
}
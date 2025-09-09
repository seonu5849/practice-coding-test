class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr = s.toUpperCase().split("");
        int cnt = 0;
        
        for(String str : arr) {
            if("P".equals(str)) {
                cnt++;
            } else if("Y".equals(str) ){
                cnt--;
            }
        }
        
        return cnt == 0;
    }
}
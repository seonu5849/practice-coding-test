class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        // 배열로 숫자를 분할
        int cnt = 0;
        String[] strs = s.split(" ");
        int[] arr = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        
        // max, min값 찾기
        int max = arr[0];
        int min = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
            
            if(num < min) {
                min = num;
            }
        }
        
        // 합치기
        return answer.append(min).append(" ").append(max).toString();
    }
}
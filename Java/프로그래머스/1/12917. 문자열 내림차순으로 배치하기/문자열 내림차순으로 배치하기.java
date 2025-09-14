class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        // 내림차순 정렬
        char[] arr = s.toCharArray();     
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // 이어 붙이기
        for(char c : arr) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}
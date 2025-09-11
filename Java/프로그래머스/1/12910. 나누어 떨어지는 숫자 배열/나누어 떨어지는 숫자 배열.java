class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        // 정렬
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // 나누어 떨어지는 숫자 찾기
        String numbers = "";
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                if("".equals(numbers)) {
                    numbers += arr[i];
                }else {
                    numbers = numbers + "," + arr[i];
                }
            }
        }
        
        // 나누어 떨어진 값이 없다면 -1
        if(numbers.length() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        String[] strArr = numbers.split(",");
        answer = new int[strArr.length];
        for(int i=0; i<strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}
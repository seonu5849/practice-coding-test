class Solution {
    public int solution(int num) {
        // 콜라츠 추측을 하다보면 큰 수를 * 3하는 순간 int의 자료형 범위를 오버할 수 있다.
        // 따라서 int 인 num을 long 타입으로 변환하여 작업을 시작한다.
        long n = num;
        
        // 주어진 num이 1일 경우 0으로 반환
        if(n == 1) {
            return 0;
        }
        
        // 500번 작업 반복 시작
        for(int i=0; i<500; i++) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            
            // 반복문 내에서 1이 된다면 현재 반복한 횟수에 +1을 하여 종료
            if(n == 1) {
                return i + 1;
            }
        }
        
        // 500번 반복했는데 1이 안됐을 경우
        return -1;
    }
}
import java.lang.Math;
class Solution {
    public long solution(long n) {
        // 제곱근
        double sqrt = Math.sqrt(n);
        
        // 제곱근이 정수인지 실수인지 확인
        // 실수라면 정수의 제곱이 아니므로 해당 과정을 거치지 않음.
        if(sqrt == (long) sqrt) {
            long sqrt1 = (long) sqrt + 1;
            return sqrt1 * sqrt1;
        }
        
        return -1;
    }
}
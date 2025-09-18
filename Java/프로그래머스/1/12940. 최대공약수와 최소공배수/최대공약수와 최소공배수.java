class Solution {
    public int[] solution(int n, int m) {
        int gdc = gdcMethod(n, m); // 최대공약수
        int lcm = (n*m) / gdc; // 최대공배수 공식
        
        int[] answer = {gdc, lcm};
        
        return answer;
    }
    
    // 최대공약수
    public int gdcMethod(int n, int m) {
        if(m == 0) {
            return n;
        }
        
        return gdcMethod(m, n%m);
    }
}
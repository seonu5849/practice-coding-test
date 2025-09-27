class Solution {
    int result = 0;
    
    public int solution(int a, int b, int n) {
        recursion(a, b, n);
        
        return result;
    }
    
    public void recursion(int a, int b, int n) {
        if(n < a) {
            return;
        }

        int get = 0;
        int give = 0;
        for(int i=1; i<=n; i++) {
            if(i%a == 0) {
                get += b; // 몇병마다 b개씩 증가
                give = i;
            }
        }

        result += get;
        recursion(a, b, n - give + get);
    }
}
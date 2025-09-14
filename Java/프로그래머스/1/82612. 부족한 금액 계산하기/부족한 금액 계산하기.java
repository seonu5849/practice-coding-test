class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;

        // 모자란 금액 구하기
        // money에 놀이기구를 탄 횟수만큼 차감.
        for(int i=1; i<=count; i++) {
            money -= (price * i);
        }
        
        // money가 양수인 경우는 금액이 부족하지 않다는 것을 의미하므로, 0을 return
        if(money > 0) {
            return 0;
        }
        
        // 부족한 금액은 money를 음수로 갖고 있기 때문에 양수로 변경해준다.
        return answer * money;
    }
}
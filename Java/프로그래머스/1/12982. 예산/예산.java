class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 오름차순 정렬
        // 작은 수 부터 물품을 구매해주어야 더 많은 부서에 물품을 전달할 수 있기 때문에
        for(int i=0; i<d.length; i++) {
            for(int j=i+1; j<d.length; j++) {
                if(d[i] > d[j]) {
                    int temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        
        // 작은 수 부터 빼 나간다.
        // 예시 1번의 경우도 1,2,3 | 1,2,5 | 1,3,4 | 1,3,5 를 햇더라도 결국 횟수로는 3회다.
        // 따라서 작은수 부터 빼주어야 많은 부서에 나눠줄 수 있으며,
        // 만약 빼려고 하는 값보다 현재 가진 금액이 적을 경우 break를 통해 중단시킨다.
        for(int cost : d) {
            if(budget < cost) break;
            
            budget -= cost;
            answer++;
        }
        
        return answer;
    }
}
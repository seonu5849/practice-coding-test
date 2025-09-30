class Solution {
    public String[] solution(String[] strings, int n) {
        
        for(int i=0; i<strings.length; i++) {
            for(int j=i+1; j<strings.length; j++) {
                char c1 = strings[i].charAt(n);
                char c2 = strings[j].charAt(n);
                
                if(c1 > c2) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if(c1 == c2) { // n번째 인덱스 문자가 같은 경우 사전순으로 앞선 문자열이 앞쪽에 위치
                    if(strings[i].compareTo(strings[j]) > 0) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        
        return strings;
    }
}
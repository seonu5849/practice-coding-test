class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        int len = phone_number.length();
        String security = phone_number.substring(0, len - 4)
                                      .replaceAll("[0-9]", "*");
        
        // 문자열 합치기
        sb.append(security);
        sb.append(phone_number.substring(len-4));
        
        return sb.toString();
    }
}
class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String security = phone_number.substring(0, len - 4)
                                      .replaceAll("[0-9]", "*");
        
        
        return security + phone_number.substring(len-4);
    }
}
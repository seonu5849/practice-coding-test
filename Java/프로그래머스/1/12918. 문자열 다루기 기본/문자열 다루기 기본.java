class Solution {
    public boolean solution(String s) {
        // 길이가 4 또는 6이 아니면 false
        if(s.length() != 4 && s.length() != 6) return false;
        
        // 숫자로만 구성돼어있는지 확인
        return s.replaceAll("[0-9]", "").length() > 0 ? false : true;
    }
}
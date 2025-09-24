import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        // 1. ")" 일때 stack이 비어있지 않다면, pop한다.
        // "(" 일때만 stack에 담아준다.
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                // 가장 처음이 ")" 이거나 ")" 차례가 와서 여길 왔지만, 스택이 비어있는 상태라면 false이다. 
                // (스택이 비어있다. = "("가 들어오지 않았다. = 순서가 이상하다.)
                if(stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            }
        } 

        // 2. stack이 비어있지 않다면 false    
        return stack.isEmpty();
    }
}
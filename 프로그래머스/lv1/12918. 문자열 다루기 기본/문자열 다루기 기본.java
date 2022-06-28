class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String p1 = "\\d{4}|{6}";
        
        if(!s.matches(p1)) answer = false;
        
        return answer;
    }
}
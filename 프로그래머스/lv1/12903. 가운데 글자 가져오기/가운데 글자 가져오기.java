class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        
        if(length % 2 == 0) {
            answer = s.substring(length/2-1, length/2+1);
        } else {
            int half = (int)Math.floor(length/2);
            answer = s.substring(half, half+1);
        }
            
            
        return answer;
    }
}
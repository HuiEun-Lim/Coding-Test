import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> answ = new ArrayList<Integer>();
        
        for(int n : nums) {
            if(!answ.contains(n)) {
                answ.add(n);
                answer++;
            }
            if(answ.size() == nums.length / 2) break;
        }
        
        return answer;
    }
}
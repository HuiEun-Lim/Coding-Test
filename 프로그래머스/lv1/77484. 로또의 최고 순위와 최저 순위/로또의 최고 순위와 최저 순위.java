class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int cnt = 0;
        
        for(int num : lottos) {
            if(num == 0) zero++;
            
            for(int win : win_nums) {
                if(num == win) {
                    cnt++;
                    break;
                }
            }
        }
        
        answer[0] = (cnt + zero == 0) ? 6 : 7 - (zero + cnt);
        answer[1] = (cnt == 0) ? 6 : 7 - cnt;
        
        return answer;
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] uniform = new int[n];
        
        for(int i=0; i<n; i++) {
            uniform[i] = 1;
        }
        
        for(int lo : lost) uniform[lo-1] -= 1;
        for(int res : reserve) uniform[res-1] += 1;
        
        for(int i=0; i<n; i++) {
            if(uniform[i] > 0) answer++;
            if(uniform[i] == 0 && i != 0) {
                if(uniform[i-1] == 2) {
                    uniform[i] += 1;
                    uniform[i-1] -= 1;
                    answer++;
                }
            }
            if(uniform[i] == 0 && i != n-1) {
                if(uniform[i+1] == 2) {
                    uniform[i] += 1;
                    uniform[i+1] -= 1;
                    answer++;
                } 
            }
        }
        
        return answer;
    }
}
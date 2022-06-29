import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int n=0; n<commands.length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            int[] answ = new int[j-i+1];
            
            for(int m=0; m<(j-i+1); m++) {
                answ[m] = array[m+i-1];
            }
            Arrays.sort(answ);
            answer[n] = answ[k-1];
        }
        
        return answer;
    }
}
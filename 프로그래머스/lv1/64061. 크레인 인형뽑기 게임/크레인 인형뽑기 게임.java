import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> moved = new ArrayList<Integer>();
        
        for(int m : moves) {
            for(int i=0; i<board.length; i++) {
                if(board[i][m-1] != 0) {
                    moved.add(board[i][m-1]);
                    board[i][m-1] = 0;
                    break;
                }
            }
            if(moved.size() >= 2 && moved.get(moved.size()-1) == moved.get(moved.size()-2) ) {
                moved.remove(moved.size()-1);
                moved.remove(moved.size()-1);
                answer += 2;
                
            }
        }
        
        return answer;
    }
}
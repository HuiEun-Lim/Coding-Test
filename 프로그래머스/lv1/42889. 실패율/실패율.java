import java.util.*;

class Solution {
    static class game {
    int stage;
    double fail;
    
        public game(int s, double f) {
            this.stage = s;
            this.fail = f;
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        List<game> games = new ArrayList<game>();
        
        for(int i=1; i<=N; i++) {
            double total = 0;
            double fail = 0;
            
            for(int s : stages) {
                if(s >= i) total++;
                if(s == i) fail++;
            }
            
            if(total != 0) games.add(new game(i, fail/total));
            else games.add(new game(i, 0));
        }
        
        Collections.sort(games, (o1, o2) -> Double.compare(o2.fail, o1.fail));
        
        for(int i=0; i<N; i++) {
            answer[i] = games.get(i).stage;
        }
        
        
        return answer;
    }
}
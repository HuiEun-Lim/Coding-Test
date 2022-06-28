class Solution {
    public int solution(int[][] sizes) {
        int[] min = new int[sizes.length];
        int[] max = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++) {
            min[i] = (sizes[i][0] <= sizes[i][1]) ? sizes[i][0] : sizes[i][1]; 
            max[i] = (sizes[i][0] > sizes[i][1]) ? sizes[i][0] : sizes[i][1]; 
        }
        
        int h = min[0];
        int w = max[0];
        
        for(int i=1; i<sizes.length; i++) {
            if(h < min[i]) h = min[i];
            if(w < max[i]) w = max[i];
        }
        
        return h * w;
    }
}
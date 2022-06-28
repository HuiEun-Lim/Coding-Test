import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answ = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(i != arr.length-1 && arr[i] != arr[i+1]) answ.add(arr[i]);
            if(i == arr.length-1) answ.add(arr[i]);
        }
        
        int[] answer = new int[answ.size()];
        
        for(int j=0; j<answ.size(); j++) {
            answer[j] = answ.get(j);
        }

        return answer;
    }
}
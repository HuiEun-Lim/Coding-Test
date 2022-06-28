import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        String[] str = new String[strings.length];
			
		for(int i=0; i<strings.length; i++) {
            map.put(i, strings[i].substring(n, n+1));
            str[i] = map.get(i);
		}
        
        Arrays.sort(str);

       for(int k=0; k<map.size(); k++) {
           List<Integer> keyList = new ArrayList<Integer>();
           
           for(Map.Entry<Integer, String> entry : map.entrySet()){
                if(entry.getValue().equals(str[k]) ){
                  keyList.add(entry.getKey());
                }
            }
           if(keyList.size() == 1) {
               answer[k] = strings[keyList.get(0)];
           } else {
               String[] s = new String[keyList.size()];
               for(int t=0; t<keyList.size(); t++) {
                    s[t] = strings[keyList.get(t)];
               }
               Arrays.sort(s);
               for(int t=0; t<s.length;t++) {
                   answer[k++] = s[t];
               }
               k--;
           }
       }
        
        return answer;
    }
}
class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        // 4단계
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        
        // 5단계
        if(new_id.equals("")) new_id = "a";
        
        // 6단계
        new_id = (new_id.length() >= 16) ? new_id.substring(0,15).replaceAll("[.]$","") : new_id;
       
        // 7단계
        if(new_id.length() <= 2) {
            char last = new_id.charAt(new_id.length()-1);
            while(new_id.length() != 3) new_id += last;
        }
        
        System.out.println(new_id);
        
        return new_id;
    }
}
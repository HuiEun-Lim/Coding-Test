class Solution {
    public String solution(String new_id) {
        
        new_id = new_id.toLowerCase() // 1단계
                .replaceAll("[^a-z0-9-_.]", "") // 2단계
                .replaceAll("[.]{2,}", ".") // 3단계
                .replaceAll("^[.]|[.]$", ""); // 4단계
        
        // 5단계
        if(new_id.equals("")) new_id = "a";
        
        // 6단계
        new_id = (new_id.length() >= 16) ? new_id.substring(0,15).replaceAll("[.]$","") : new_id;
       
        // 7단계
        if(new_id.length() <= 2) {
            char last = new_id.charAt(new_id.length()-1);
            while(new_id.length() != 3) new_id += last;
        }
        
        return new_id;
    }
}
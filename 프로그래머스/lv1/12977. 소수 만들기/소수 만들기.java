class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean yn = false;
                    for(int n=3; n<sum; n++) {
                        if(sum % n == 0) yn = true;
                    }
                    if(!yn) answer++;
                }
            }
        }

        return answer;
    }
}
class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            
            if (max < sides[i]) {
                max = sides[i];
            }
            sum += sides[i];
        }
        
        int answer = ((sum - max) > max) ? 1 : 2;
        return answer;
    }
}
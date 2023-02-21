class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num2 == 0) {
            return answer;
        }else {
            answer = num1 / num2;
            return answer;
        }
    }
}
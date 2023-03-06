class Solution {
    public int solution(int n) {
        if (n <= 7 ) {
            return 1;
        }
        int answer = 0;
        if (n % 7 != 0){
            answer++;
        }
        return (n / 7) + answer;
    }
}
class Solution {
    public int solution(int n) {
        int sum = 0;
        sum += n % 10;

        if (n != 0) {
            return sum + solution(n / 10);
        } else {
            return 0;
        }
    }
}
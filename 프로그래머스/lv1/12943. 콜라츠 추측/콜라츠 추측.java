class Solution {
    public int solution(int num) {
        int answer = 0;
        long lNum = num;
        while (lNum != 1) {
            lNum = (lNum % 2 == 0) ? lNum / 2 : (lNum * 3 ) + 1;
            answer++;
            if (answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
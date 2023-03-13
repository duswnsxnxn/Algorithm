class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        
        int[] answer = new int [num2 - num1 + 1];
        // if (num2 == 1) {
        //     answer[0] = numbers[0];
        //     return answer;
        // }
        if (num1 > num2 || numbers.length < num2) {
            return null;
        }
        int j = 0;
        for (int i = num1; i <= num2; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int temp = 0;
        int length = numbers.length - 1;
        int[] answer = new int [length + 1];
        if (direction.equals("left")) {
            for (int i = 0; i < length ; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[length] = numbers[0];
            return answer;
        }

        for (int i = length; i > 0 ; i--) {
            answer[i] = numbers[i - 1];
        }
        answer[0] = numbers[length];
        return answer;
    }
}
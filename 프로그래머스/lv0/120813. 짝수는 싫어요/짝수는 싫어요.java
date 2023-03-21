class Solution {
    public int[] solution(int n) {
        int size = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                size++;
            }
        }
        System.out.println(size);
        int[] answer = new int[size];

        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
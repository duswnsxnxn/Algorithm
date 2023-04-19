class Solution {
    public int solution(int age) {

        int answer = 0;
        char[] value = {'3', '6', '9'};
        String orders = String.valueOf(age);
        for (int i = 0; i < orders.length(); i++) {
            for (int j = 0; j < value.length; j++) {
                if (orders.charAt(i) == value[j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
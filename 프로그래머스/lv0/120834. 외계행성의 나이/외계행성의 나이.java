class Solution {
    public String solution(int age) {

        String answer = "";
        String chars = String.valueOf(age);
        for (int i = 0; i < chars.length(); i++) {
            answer += (char) (chars.charAt(i) + 49);
        }

        return answer;
    }
}
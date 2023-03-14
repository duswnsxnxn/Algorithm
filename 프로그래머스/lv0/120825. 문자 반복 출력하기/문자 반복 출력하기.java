class Solution {
    public String solution(String my_string, int n) {
        
        char[] split = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(split[i]);
            }
    }
        String answer = sb.toString();
        return answer;
    }
}
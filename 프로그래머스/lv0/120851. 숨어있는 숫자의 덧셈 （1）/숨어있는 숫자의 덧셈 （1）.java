class Solution {
    public int solution(String my_string) {
        
        String [] split = my_string.split("");
        int answer = 0;
        for(String str : split){
            if (str.matches("[0-9]")) {
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}
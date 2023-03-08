class Solution {
    public int solution(String[] babbling) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < speak.length; j++) {
                babbling[i] = babbling[i].replaceFirst(speak[j], "1");
            }
            babbling[i] = babbling[i].replace("1", "");
            count += (babbling[i].equals("")) ? 1 : 0;
        }
        return count;
    }
}
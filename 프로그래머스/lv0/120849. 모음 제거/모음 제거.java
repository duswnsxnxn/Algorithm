class Solution {
    public String solution(String my_string) {
        String [] vowel = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < vowel.length; j++) {
                my_string = my_string.replace(vowel[j], "");
            }
        }
        return my_string;
    }
}
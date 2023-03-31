import java.util.*;
class Solution {
    public int[] solution(String my_string) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                arrayList.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        int[] answer = arrayList.stream().mapToInt(i -> i).sorted().toArray();
        return answer;
    }
}
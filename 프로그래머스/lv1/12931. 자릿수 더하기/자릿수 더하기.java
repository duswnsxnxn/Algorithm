import java.util.*;

public class Solution {
    public int solution(int n) {
        String nums[] = String.valueOf(n).split("");
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            answer += Integer.parseInt(nums[i]);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
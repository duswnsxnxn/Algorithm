import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int n, int[] numlist) {

        List<Integer> collect = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        collect.removeIf(num -> (num % n != 0));
        return collect.stream().mapToInt(i -> i).toArray();
    }
}
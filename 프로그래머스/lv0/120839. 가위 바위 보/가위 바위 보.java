import java.util.*;
class Solution {
    public String solution(String rsp) {
        
        String[] split = rsp.split("");
        Map<String, String> enjoy = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        enjoy.put("2", "0");
        enjoy.put("0", "5");
        enjoy.put("5", "2");
        for (int i = 0; i < split.length; i++) {
            sb.append(enjoy.get(split[i]));
        }
        return sb.toString();
    }
}
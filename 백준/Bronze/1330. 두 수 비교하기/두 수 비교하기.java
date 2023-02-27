import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (nums.length < 2) {
            System.out.println("종료");
            return;
        }
        if (nums[0] > nums[1]) {
            System.out.print(">");
        } else if (nums[0] == nums[1]) {
            System.out.print("==");
        } else {
            System.out.print("<");
        }
    }

}
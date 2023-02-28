import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double[] nums = Arrays.stream(bf.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        if (nums.length < 2 || (nums[0] < 0 && nums[1] > 10)) {
            System.out.println("종료");
            return;
        }
        System.out.println(nums[0] / nums[1]);
    }

}
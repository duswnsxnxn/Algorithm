import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int N, M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();  // 출력 최적화를 위한 StringBuilder

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        result = new int[M];

        backtracking(1, 0);
        System.out.print(sb.toString());  // 한 번에 출력
    }

    public static void backtracking(int start, int depth) {
        if (depth == M) {
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {  // start부터 시작 (오름차순 유지)
            result[depth] = i;
            backtracking(i, depth + 1);  // 같은 숫자도 선택 가능 → `i` 그대로 유지
        }
    }
}
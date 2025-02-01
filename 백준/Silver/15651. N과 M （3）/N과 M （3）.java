import java.util.Scanner;

class Main {
    static int N, M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();  // 출력 최적화를 위한 StringBuilder

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  
        M = sc.nextInt();

        result = new int[M];  

        backtracking(0);
        System.out.print(sb.toString());  // 한 번에 출력
        sc.close();
    }

    public static void backtracking(int depth) {
        if (depth == M) {  
            for (int num : result) {
                sb.append(num).append(" ");  // StringBuilder에 추가
            }
            sb.append("\n");  // 개행 추가
            return;
        }

        for (int i = 1; i <= N; i++) {
            result[depth] = i;  
            backtracking(depth + 1);  
        }
    }
}
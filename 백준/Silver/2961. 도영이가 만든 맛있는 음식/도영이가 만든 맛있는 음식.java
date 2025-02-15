import java.util.Scanner;

public class Main {

    static int N; // 재료 개수
    static int[][] ingredients; // 재료 정보 (신맛, 쓴맛)
    static int minDiff = Integer.MAX_VALUE; // 최소 차이 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ingredients = new int[N][2];

        for (int i = 0; i < N; i++) {
            ingredients[i][0] = sc.nextInt(); // 신맛 (S)
            ingredients[i][1] = sc.nextInt(); // 쓴맛 (B)
        }

        findMinDifference(0, 1, 0, 0);
        System.out.println(minDiff);
        sc.close();
    }

    // 백트래킹을 이용해 가능한 모든 조합 탐색
    public static void findMinDifference(int index, int sour, int bitter, int count) {
        if (index == N) {
            if (count > 0) { // 최소 한 개 이상의 재료 선택
                minDiff = Math.min(minDiff, Math.abs(sour - bitter));
            }
            return;
        }

        // 1️⃣ 현재 재료를 선택하는 경우
        findMinDifference(index + 1, sour * ingredients[index][0], bitter + ingredients[index][1], count + 1);

        // 2️⃣ 현재 재료를 선택하지 않는 경우
        findMinDifference(index + 1, sour, bitter, count);
    }
}
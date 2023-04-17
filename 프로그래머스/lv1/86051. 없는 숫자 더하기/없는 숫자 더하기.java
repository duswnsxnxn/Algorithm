class Solution {
    public int solution(int[] numbers) {
        
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < 10; i++) {
            a += i;
        }
        
        for (int i = 0; i < numbers.length; i++) {
            b += numbers[i];
        }          
        
        return a - b;
    }
}
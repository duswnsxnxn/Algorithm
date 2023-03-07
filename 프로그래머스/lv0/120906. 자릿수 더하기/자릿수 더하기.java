class Solution {
    public int solution(int n) {
        return (n + "")
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
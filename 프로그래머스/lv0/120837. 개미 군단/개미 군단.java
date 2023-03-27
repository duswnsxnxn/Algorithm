class Solution {
    public int solution(int hp) {
        int attack = 0;
        if (hp / 5 > 0) {
            attack += (hp / 5);
            hp = hp % 5;
        }
        if (hp / 3 > 0) {
            attack += (hp / 3);
            hp = hp % 3;
        }
        if (hp / 1 > 0) {
            attack += (hp / 1);
            hp = 0;
        }
        return attack;
    }
}
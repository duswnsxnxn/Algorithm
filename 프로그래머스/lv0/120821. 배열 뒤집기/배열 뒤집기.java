class Solution {
    public int[] solution(int[] num_list) {
        
        int temp = 0;
        int j = num_list.length - 1;
        
        for(int i = 0; i < num_list.length / 2; i++){
            temp = num_list[i];
            num_list[i] = num_list[j];
            num_list[j] = temp;
            j--;
        }
        return num_list;
    }
}
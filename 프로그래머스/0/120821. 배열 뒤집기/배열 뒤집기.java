class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
		int cursor = num_list.length -1;
		for(int i=0; i<num_list.length; i++) {
			result[cursor]=num_list[i];
			cursor--;
		}
		return result;
    }
}
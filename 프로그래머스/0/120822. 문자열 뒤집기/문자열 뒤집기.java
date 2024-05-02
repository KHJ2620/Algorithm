class Solution {
    public String solution(String my_string) {
        String answer = my_string;
		char[] core = answer.toCharArray();
		char[] trans = new char[core.length];
		int cursor = 0;
		for(int i=core.length-1; i>=0; i--) {
			trans[cursor] = core[i];
			cursor++;
		}
		String result = new String(trans);
        return result;
    }
}
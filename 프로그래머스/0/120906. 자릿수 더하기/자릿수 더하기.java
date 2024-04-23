class Solution {
    public int solution(int n) {
        int answer = 0;
        int digit = 1;
		
		while (digit <= n) {
			int pick = n % (digit * 10) / digit;			
			digit *= 10;
            answer += pick;
        }
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i+=2){
            if(n % 2 == 1) {
                answer += i;
            } else {
                answer += (i+1)*(i+1);
            }
        }
        return answer;
    }
}
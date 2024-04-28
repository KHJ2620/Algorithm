class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i=1; i<=n; i++){
            cnt = 0;
            for(int x=1; x<=i; x++) {
                if(i%x == 0){
                    cnt++;
                }
            }
            if(cnt>=3) {
            answer++;
            }
        }
        
        return answer;
    }
}
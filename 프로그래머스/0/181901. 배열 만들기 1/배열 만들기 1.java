class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i=1, x=0; i<=n; i++){
            if (n>=i*k){
                answer[x] = i * k;
                x++;
            }
            
        }
        return answer;
    }
}
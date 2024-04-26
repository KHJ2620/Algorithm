class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 매개변수로 들어온 mystring에서 char[]을 추출
        // 그 크기만큼의 새로운 char[]을 만들어
        // 추출한 char[]을 하나씩 for문으로 접근
        // 만약 대문자구간(65~90) 이면 +32해서 세팅
        // 만약 소문자구간(97~122)이면 -32해서 세팅
        
        //세팅 끝난 char[] 가지고 String 만들어서 return
        
        char[] r = my_string.toCharArray();
        for(int i=0; i<r.length; i++){
            if(r[i] >=65 && r[i]<=90) {
                r[i] += 32;
            } else if(r[i]>=97 && r[i] <= 122) {
                r[i] -= 32;
            }
        }
        answer = new String(r);
        
        
        return answer;
    }
}
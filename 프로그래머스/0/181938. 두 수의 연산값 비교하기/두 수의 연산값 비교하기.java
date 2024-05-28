class Solution {
    public int solution(int a, int b) {
        String add = Integer.toString(a)+Integer.toString(b);
        int mul = 2 * a * b;
        if(Integer.parseInt(add)>=mul) {
            return Integer.parseInt(add);
        } else {
            return mul;
        }
    }
}
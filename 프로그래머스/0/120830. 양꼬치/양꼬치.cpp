#include <string>
#include <vector>

using namespace std;

int solution(int n, int k) {
    int answer = 0;
    if (n >= 10) {
        answer = 12000*n + 2000*k -2000*(n/10);
    } else {
        answer = 12000*n + 2000*k;
    }
    return answer;
}
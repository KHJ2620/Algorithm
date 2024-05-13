import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] names) {
        List<String> answerList = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i==0 || i%5==0){
                answerList.add(names[i]);
            }
        }
        return answerList.toArray(new String[answerList.size()]);
    }
}
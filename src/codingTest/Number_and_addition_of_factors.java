package codingTest;

public class Number_and_addition_of_factors {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i < (right+1); i++) {
            int count = 0;
            for (int j = 1; j < (i+1); j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0){
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }


}
    //https://programmers.co.kr/learn/courses/30/lessons/77884

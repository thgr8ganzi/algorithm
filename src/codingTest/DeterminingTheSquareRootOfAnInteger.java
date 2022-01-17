package codingTest;

public class DeterminingTheSquareRootOfAnInteger {

    public long solution(long n) {
        long answer = 0;

        for(int i = 1; i * i <= n; i++) {
            if (n / i == i && n % i == 0) {
                answer = (i + 1);
                break;
            } else {
                answer = -1;
            }
        }
        if(answer != -1) {
            answer = answer * answer;
        }

        return answer;
    }

}
// https://programmers.co.kr/learn/courses/30/lessons/12934



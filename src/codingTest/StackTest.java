package codingTest;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 4, 3, 8, 7, 6, 4}));
    }
    public static boolean solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int nextNumber = 1;

        for (int num : arr) {
            while (nextNumber <= num) {
                stack.push(nextNumber++);
            }

            if (stack.peek() == num) {
                stack.pop();
            } else {
                return false;
            }
        }

        return true;
    }
}

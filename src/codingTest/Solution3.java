package codingTest;

import java.util.Arrays;

public class Solution3 {
    private int count = 0;

    public int solution(int[] arr, int k, int t) {
        Arrays.sort(arr);
        for (int startK = k; startK <= arr.length; startK++) {
            backtrack(arr, startK, t, 0, 0, 0);
        }
        return count;
    }

    private void backtrack(int[] arr, int k, int t, int index, int sum, int selected) {
        if (sum > t) {
            return;
        }
        if (selected == k) {
            if (sum <= t) {
                count++;
            }
        }
        for (int i = index; i < arr.length; i++) {
            backtrack(arr, k, t, i + 1, sum + arr[i], selected + 1);
        }
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] arr1 = {2, 5, 3, 8, 1};
        int k1 = 3;
        int t1 = 11;
        System.out.println(sol.solution(arr1, k1, t1)); // 예상 결과: 6
    }
}

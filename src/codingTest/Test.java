package codingTest;

public class Test {


    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(6, 5, 4));
    }

    public static Long solution(int n, int r, int c) {
        long[][] map = new long[n][n];
        map[0][0] = 1;
        map[n - 1][n - 1] = n * n;
        int x = 1, y = 0;
        long startN = 2;

        for (int i = 1; i < n; ++i) {
            if (i % 2 == 0) {
                x = i;
                y = 0;
            } else {
                x = 0;
                y = i;
            }

            for (int j = 0; j <= i; ++j) {
                if (i % 2 != 0) {
                    if (x < n && y < n) map[x][y] = startN++;
                    x++;
                    y--;
                } else {
                    if (x < n && y < n) map[x][y] = startN++;
                    x--;
                    y++;
                }
                if (map[r - 1][c - 1] != 0) return map[r - 1][c - 1];
            }
        }
        for (int i = n - 2; i >= 0; --i) {
            if (i % 2 == 0) {
                x = n - 1;
                y = n - i - 1;
            } else {
                x = n - i - 1;
                y = n - 1;
            }

            for (int j = 0; j <= i; ++j) {
                if (i % 2 == 0) {
                    if (x < n && y < n) map[x][y] = startN++;
                    x--;
                    y++;
                } else {
                    if (x < n && y < n) map[x][y] = startN++;
                    x++;
                    y--;
                }
                if (map[r - 1][c - 1] != 0) return map[r - 1][c - 1];
            }
        }
        return map[r - 1][c - 1];
    }
    public static long solution1(int n, int r, int c) {
        long result = 0;
        int diag = r + c - 2;
        long totalBeforeDiag = 0;

        if (diag < n) {
            totalBeforeDiag = (1L + diag) * diag / 2;
        } else {
            int over = diag - n + 1;
            totalBeforeDiag = (n - 1L) * n / 2 + (n - 1L - over) * (over) / 2;
        }

        if (diag % 2 == 0) {
            result = totalBeforeDiag + c;
        } else {
            result = totalBeforeDiag + (diag - n < 0 ? diag + 1 : n) - r + 1;
        }

        return result;
    }
}




public class TwoDimensionalLoop {

    static int n = 5, m = 5;
    static int[][] map = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0}
    };

    // 상, 하, 좌, 우 (순서 중요 X)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                System.out.println("현재 좌표: (" + x + ", " + y + ") 값: " + map[x][y]);

                for (int dir = 0; dir < 4; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    System.out.println(" → 이동 가능: (" + nx + ", " + ny + ") 값: " + map[nx][ny]);
                }

                System.out.println("------------");
            }
        }
    }
}
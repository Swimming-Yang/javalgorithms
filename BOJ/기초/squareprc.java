package 기초;

public class squareprc {
    public static void main(String[] args) {
        
        int num = 1;
        int [][] arr = new int[5][5];

        int [] dx = {0, 1, 0, -1};
        int [] dy = {1, 0, -1, 0};

        int direction = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 25; i++) {
            arr[x][y] = num++;

        int next_X = x + dx[direction];
        int next_Y = y + dy[direction];

        if(next_X < 0 || next_X >= 5 || next_Y < 0 || next_Y >= 5 || arr[next_X][next_Y] != 0) {
            direction = (direction + 1) % 4;
            next_X = x + dx[direction];
            next_Y = y + dy[direction];

        }
        x = next_X;
        y = next_Y;

        }

        for(int j = 0; j < 5; j++) {
            for(int k = 0; k < 5; k++) {
                System.out.printf("%2d", arr[j][k]);

            }
            System.out.println();
        }
    }
}
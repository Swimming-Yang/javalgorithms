package 문자열;

public class arr_test {
    public static void main(String[] args) {
        int num_start = 1;

        int [][] arr_num = new int[5][5];
        for(int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                // 짝수 행: 왼쪽 → 오른쪽
                for(int j = 0; j < 5; j++) {
                    arr_num[i][j] = num_start;
                    num_start++;
                }
            } else {
                // 홀수 행: 오른쪽 → 왼쪽
                for(int j = 4; j >= 0; j--) {
                    arr_num[i][j] = num_start;
                    num_start++;
                }
            }
        }

        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("[" + arr_num[i][j] + "]");
            }
            System.out.println();
        }
    }
}


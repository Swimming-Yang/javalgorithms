package 기초;

public class zzigzzag {
    public static void main(String[] args) {
        
        int num = 1;
        for(int i = 1; i <= 5; i++) {
            if (i % 2 == 1) { //홀수 번째 줄
                for(int j = 0; j < 5; j++) {
                    System.out.print(num++);
                }
            } else {
                int [] arr = new int[5];
                for(int k = 0; k < arr.length; k++) {
                    arr[k] = num++;
                }
                for(int l = 4; l >= 0; l--) {
                    System.out.print(arr[l]);
                }
            }
            System.out.println();
        }
    }
}


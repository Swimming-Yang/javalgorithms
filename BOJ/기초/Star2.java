package 기초;

public class Star2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {//5번 루프
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
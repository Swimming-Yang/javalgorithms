package 기초;

public class Star1 {
    public static void main(String[] args) {
        //별 찍기
        for(int i = 1; i < 6; i++) {
            System.out.println();
            for(int j = 1; j < i; j++){
            System.out.print("*");
            }
        }
    }
}
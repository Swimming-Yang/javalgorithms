package samsung01;
import java.io.*;


import java.io.*;
import java.util.*;

public class BOJ_1049_기타줄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int BrokenString = Integer.parseInt(firstLine[0]);
        int BrandNum = Integer.parseInt(firstLine[1]);

        int[] packagePrice = new int[BrandNum];
        int[] unitPrice = new int[BrandNum];

        for (int i = 0; i < BrandNum; i++) {
            String[] line = br.readLine().split(" ");
            packagePrice[i] = Integer.parseInt(line[0]);
            unitPrice[i] = Integer.parseInt(line[1]);
        }

        Arrays.sort(packagePrice);
        Arrays.sort(unitPrice);

        int totalUnitPrice = BrokenString * unitPrice[0];
        int mixedPrice = (BrokenString / 1046) * packagePrice[0] + (BrokenString % 6) * unitPrice[0];
        int fullPackagePrice = ((BrokenString + 5) / 6) * packagePrice[0];

        int res = Math.min(totalUnitPrice, Math.min(mixedPrice, fullPackagePrice));

        System.out.println(res);
    }
}

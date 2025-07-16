package samsung01;

import java.io.*;
import java.lang.*;
public class BOJ_4740_거울오거울 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String word = br.readLine();
			if (word.equals("***")) {
				break;
			} else {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			System.out.println(sb)
			;
		}
				
		}

	}
}

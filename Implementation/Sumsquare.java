
import static java.lang.Math.abs;
import java.util.Scanner;

public class Sumsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();

		long n[] = new long[(int) t];
		long p = 0;
		for (int j = 0; j < t; j++) {
			n[j] = s.nextLong();
		}
		s.close();
		for (int j = 0; j < t; j++) {
			long x = 0, y = 0;
			p = n[j];
			for (int i = 1; i < p + 1; i++) {
				x = x + (i * i);
				y = y + i;
			}
			System.out.println(abs((y * y) - x));
		}
	}

}

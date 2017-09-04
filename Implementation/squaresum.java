import static java.lang.Math.abs;
import java.util.Scanner;

public class squaresum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		int n[] = new int[t];
		int p = 0;
		for (int j = 0; j < t; j++) {
			n[j] = s.nextInt();
		}
		s.close();
		for (int j = 0; j < t; j++) {
			int x = 0, y = 0;
			p = n[j];
			for (int i = 1; i <= p ; i++) {
				x = x + (i * i);
				y = y + i;
			}
			System.out.println(abs((y * y) - x));
		}
	}
}
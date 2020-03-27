
/*題目內容:
输入一个正整数n，计算1-1/4+1/7-1/10+1/13-1/16+...前n项之和。
输入输出说明:
输入：
2
输出：
0.75*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		// write your code
		double sum = 0, x = 1, j = 1;
		for (int i = 1; i <= n; i++) {
			sum += (x * 1.0 / j);
			x *= -1;
			j += 3;
		}
		System.out.println(sum);
		scanner.close();
	}
}
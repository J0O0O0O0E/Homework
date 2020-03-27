
/*題目內容:
从键盘中输入两个年份，输出这两个年份之间的所有的闰年年份。

输入顺序：小年份 大年份

输入输出说明:
输入：
1980 2010
输出：
1980 1984 1988 1992   
1996 2000 2004 2008 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m, n;

		m = scanner.nextInt();
		n = scanner.nextInt();

		// write your code
		int j = 1;
		for (int i = m; i <= n; i++) {
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {

				System.out.print(i + " ");
				if (j % 4 == 0) {
					System.out.println();
				}
				j++;
			}
		}

	}
}

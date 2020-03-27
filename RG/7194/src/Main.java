
/*題目內容:
求a+aa+aaa+aa…a
输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
输入2个正整数a和n, 求a+aa+aaa+aa…a(n个a)之和。
例：括号内是说明
输入
2  (repeat=2)
2 3 (a=2, n=3)
8 5 (a=8, n=5)
输出
246   (2+22+222)
98760 (8+88+888+8888+88888)*/
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int repeat = input.nextInt();
		for (int i = 1; i <= repeat; i++) {
			int a = input.nextInt();
			int n = input.nextInt();
			int tmp = 0, sum = 0;
			for (int j = 0; j < n; j++) {
				tmp += a * Math.pow(10, j);
				sum += tmp;
			}
			System.out.println(sum);
		}
		input.close();
	}

}

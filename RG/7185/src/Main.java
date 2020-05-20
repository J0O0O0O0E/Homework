/*題目內容:
从键盘输入一个大于1正整数n，输出n以内的素数
输入输出说明:
请输：5
输出：2 3 5
请输：0
输出：输入n不是大于1正整数*/
import java.util.*;

public class Main {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n < 2) {
			System.out.println("输入n不是大于1正整数");
		} else {
			for (int i = 2; i <= n; i++) {
				int flag = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 1) {
					continue;
				} else {
					System.out.print(i + " ");
				}
			}
		}
		input.close();
	}
}

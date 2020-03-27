
/*題目內容:
输入1个四位数，将其加密后输出。

方法是将该数每一位上的数字加9，

然后除以10取余，做为该位上的新数字，

最后将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数。

输入输出说明:
输入：
3245
输出：
The encrypted number is 3421*/
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int number, digit1, digit2, digit3, digit4, newnum;
		int temp;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		// WRITE CODE HERE
		int[] tmp = new int[5];
		for (int i = 1; i <= 4; i++) {
			tmp[i] = (number % 10 + 9) % 10;
			number /= 10;
		}
		tmp[0] = tmp[1];
		tmp[1] = tmp[2];
		tmp[2] = tmp[0];
		tmp[0] = tmp[3];
		tmp[3] = tmp[4];
		tmp[4] = tmp[0];
		int j = 1;
		newnum = 0;
		for (int i = 3; i >= 0; i--) {
			newnum += tmp[j] * Math.pow(10, i);
			j++;
		}
		scanner.close();
		System.out.println("The encrypted number is " + newnum);
	}
//个十百千
//十个千百
}

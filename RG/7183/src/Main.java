/*題目內容:
从键盘输入三个整数，然后按照从小到大的顺序将其输出。
输入输出说明:
输入：3 2 1
输出：1 2 3
*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		input.close();
	}
}


/*�}Ŀ����:
����һ��������n������1-1/4+1/7-1/10+1/13-1/16+...ǰn��֮�͡�
�������˵��:
���룺
2
�����
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
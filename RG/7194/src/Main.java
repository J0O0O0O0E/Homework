
/*�}Ŀ����:
��a+aa+aaa+aa��a
����һ��������repeat (0<repeat<10)����repeat���������㣺
����2��������a��n, ��a+aa+aaa+aa��a(n��a)֮�͡�
������������˵��
����
2  (repeat=2)
2 3 (a=2, n=3)
8 5 (a=8, n=5)
���
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

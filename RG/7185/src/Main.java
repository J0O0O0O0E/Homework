/*�}Ŀ����:
�Ӽ�������һ������1������n�����n���ڵ�����
�������˵��:
���䣺5
�����2 3 5
���䣺0
���������n���Ǵ���1������*/
import java.util.*;

public class Main {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n < 2) {
			System.out.println("����n���Ǵ���1������");
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

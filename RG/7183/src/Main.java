/*�}Ŀ����:
�Ӽ�����������������Ȼ���մ�С�����˳���������
�������˵��:
���룺3 2 1
�����1 2 3
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


/*�}Ŀ����:
�ҳ�4*4�ľ����е����ֵ������������ڵ�����ֵ
�������˵��:

���룺
1 2 3 4
4 5 6 7
7 4 1 0
9 6 3 2
�����
max=9
x=3 y=0

*/import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				a[i][j] = scan.nextInt();
		}
		// Write Code Here
		int max = a[0][0], x = 0, y = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				if (a[i][j] > max) {
					max = a[i][j];
					x = i;
					y = j;
				}
		}
		System.out.println("max=" + max + "\nx=" + x + " y=" + y);
	}
}
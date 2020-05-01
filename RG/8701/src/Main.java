
/*�}Ŀ����:

дһ������void triangle(int a,int b,int c)���ж����������Ƿ��ܹ���һ�������Ρ�����������׳��쳣IllegalArgumentException����ʾ�쳣��Ϣ����a,b,c���ܹ��������Ρ���������Թ�������ʾ�����������߳������������еõ�������������������������ô˷������������쳣��

�������˵��:

2 4 3
�����ε����߳�Ϊ��2,4,3
1 2 3
1,2,3���ܹ���������
1 2.0 3
������������Ϊ�����εı߳���

*/
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class TestTriangle {
	static void triangle(int a, int b, int c) throws IllegalArgumentException, InputMismatchException {
		// starts
		int x = 0;
		if (a + b <= c || a + c <= b || b + c <= a) {
			x = 1;
			throw new IllegalArgumentException();
		}
		if (a % 1 != 0 || b % 1 != 0 || c % 1 != 0) {
			x = 1;
			throw new InputMismatchException();
		}
		if (x == 0) {
			System.out.println("�����ε����߳�Ϊ��" + a + "," + b + "," + c);
		}
		// end
	}
}

public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner in = new Scanner(System.in);

		try {
			// starts
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			TestTriangle.triangle(a, b, c);
			// end
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(a + " " + b + " " + c + "���ܹ���������");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("������������Ϊ�����εı߳���");
		}
	}
}
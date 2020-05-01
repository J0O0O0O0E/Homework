
/*題目內容:

写一个方法void triangle(int a,int b,int c)，判断三个参数是否能构成一个三角形。如果不能则抛出异常IllegalArgumentException，显示异常信息：“a,b,c不能构成三角形”；如果可以构成则显示三角形三个边长。在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常。

输入输出说明:

2 4 3
三角形的三边长为：2,4,3
1 2 3
1,2,3不能构成三角形
1 2.0 3
请输入整数作为三角形的边长！

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
			System.out.println("三角形的三边长为：" + a + "," + b + "," + c);
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
			System.out.println(a + " " + b + " " + c + "不能构成三角形");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("请输入整数作为三角形的边长！");
		}
	}
}
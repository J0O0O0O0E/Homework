
/*題目內容:

定义并实现一个复数类Complex，要求实现复数的加法和减法。

类拥有两个成员变量a和b，分别代表复数的实部和虚部。

类有默认构造方法（a和b的默认值为0），也有拷贝构造方法（参数为复数类对象的引用）。

另外还应该有一个Print方法打印复数，打印格式为a+bi，若实部虚部都为0，则输出0。两个复数的实部、虚部在main方法中由键盘输入。

输入输出说明:

输入：
3 4 1 2
输出：
4+6i
2+2i

*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int m, n; // 第一个数的实部和虚部
		int p, q; // 第二个数的实部和虚部
		Scanner scanner = new Scanner(System.in);
		m = Integer.parseInt(scanner.next());
		n = Integer.parseInt(scanner.next());
		p = Integer.parseInt(scanner.next());
		q = Integer.parseInt(scanner.next());
		Complex t = new Complex(m, n);
		Complex s = new Complex(t);
		Complex r = new Complex(p, q);
		(s.Add(r)).Print();
		(t.Sub(r)).Print();
	}
}

// Write your own code
class Complex {
	private int a = 0, b = 0;

	public Complex(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Complex(Complex x) {
		this.a = x.a;
		this.b = x.b;
	}

	public Complex Add(Complex x) {
		Complex c = new Complex(this.a + x.a, this.b + x.b);
		return c;

	}

	public Complex Sub(Complex x) {
		Complex c = new Complex(a - x.a, b - x.b);
		return c;
	}

	public void Print() {
		if (a == 0 && b == 0) {
			System.out.println("0");
		} else {
			System.out.println(a + " " + b + "i");
		}
	}
}
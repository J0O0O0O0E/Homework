import java.util.Scanner;

/*題目內容:

创建一个类，为该类定义三个构造函数，从键盘输入两个int值，三个double值，两个字符串，分别执行下列操作：
1、传递两个整数值并找出其中较大的一个值
2、传递三个double值并求出其乘积
3、传递两个字符串值并检查其是否相同
4、在main方法中测试构造函数的调用

 
输入输出说明:

输入：
9 15
3.3 4.4 5.5
ab
ab
输出：
Larger value: 15
a*b*c = 79.86
Are equal: true 

*/
class Check {
	// write your code here
	int a, b;
	double c, d, e;
	String f, g;

	public Check(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int Ans() {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public Check(double a, double b, double c) {
		this.c = a;
		this.d = b;
		this.e = c;
	}

	public double Ans2() {
		return c * d * e;
	}

	public Check(String a, String b) {
		this.f = a;
		this.g = b;
	}

	public boolean Ans3() {
		return f.equals(g);
	}
}

public class Main {
	public static void main(String args[]) {
		// write your code here
		Scanner in = new Scanner(System.in);
		System.out.println("Larger value: " + (new Check(in.nextInt(), in.nextInt()).Ans()));
		System.out.println("a*b*c = " + (new Check(in.nextDouble(), in.nextDouble(), in.nextDouble()).Ans2()));
		System.out.println("Are equal: " + (new Check(in.next(), in.next()).Ans3()));

	}
}
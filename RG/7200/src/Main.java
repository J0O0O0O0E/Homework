import java.util.Scanner;

/*�}Ŀ����:

����һ���࣬Ϊ���ඨ���������캯�����Ӽ�����������intֵ������doubleֵ�������ַ������ֱ�ִ�����в�����
1��������������ֵ���ҳ����нϴ��һ��ֵ
2����������doubleֵ�������˻�
3�����������ַ���ֵ��������Ƿ���ͬ
4����main�����в��Թ��캯���ĵ���

 
�������˵��:

���룺
9 15
3.3 4.4 5.5
ab
ab
�����
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

/*�}Ŀ����:

���岢ʵ��һ��������Complex��Ҫ��ʵ�ָ����ļӷ��ͼ�����

��ӵ��������Ա����a��b���ֱ��������ʵ�����鲿��

����Ĭ�Ϲ��췽����a��b��Ĭ��ֵΪ0����Ҳ�п������췽��������Ϊ�������������ã���

���⻹Ӧ����һ��Print������ӡ��������ӡ��ʽΪa+bi����ʵ���鲿��Ϊ0�������0������������ʵ�����鲿��main�������ɼ������롣

�������˵��:

���룺
3 4 1 2
�����
4+6i
2+2i

*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int m, n; // ��һ������ʵ�����鲿
		int p, q; // �ڶ�������ʵ�����鲿
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

/*�}Ŀ����:

����һ�������࣬���㳤���������������Ҫ���þ�̬������ɡ�
�������˵��:

���룺
1 2 6
�����
40.0
12.0

*/
import java.util.Scanner;

class Calculate {

	// write your own codes
	public static double calRectArea(double a, double b, double c) {
		return a * b * 2 + a * c * 2 + b * c * 2;
	}

	public static double calCubeVol(double a, double b, double c) {
		return a * b * c;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b = sca.nextInt();
		int c = sca.nextInt();
		double area = Calculate.calRectArea(a, b, c);
		double vol = Calculate.calCubeVol(a, b, c);
		System.out.println(area);
		System.out.println(vol);
	}

}


/*�}Ŀ����:

����һ���������࣬������3����Ա�������������ߣ������������ܷ�����һ����setDemo(int x,int y,int z)��Ϊ����߸�ֵ����һ��ʵ�ּ�������Ĺ��ܣ���д���࣬���������У�����һ����������Ķ��󣬴Ӽ����������Ա�����������������������������ʾ����Ļ��

�������˵��:

���룺1 2 3
��������=6

*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lft a = new Lft();
		a.setX(input.nextInt());
		a.setY(input.nextInt());
		a.setZ(input.nextInt());
		System.out.println("���=" + a.volume());
		input.close();
	}
}

class Lft {
	private int x, y, z;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int volume() {
		return x * y * z;
	}
}
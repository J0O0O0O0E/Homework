
/*題目內容:

创建一个立方体类，类中有3个成员变量：长、宽、高，共有两个功能方法，一个是setDemo(int x,int y,int z)，为长宽高赋值；另一个实现计算体积的功能，编写主类，在主方法中，创建一个立方体类的对象，从键盘输入其成员变量，求该立方体对象的体积，结果显示在屏幕上

输入输出说明:

输入：1 2 3
输出：体积=6

*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lft a = new Lft();
		a.setX(input.nextInt());
		a.setY(input.nextInt());
		a.setZ(input.nextInt());
		System.out.println("体积=" + a.volume());
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
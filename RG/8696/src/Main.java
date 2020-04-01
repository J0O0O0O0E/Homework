
/*題目內容:

创建一个Car类，类中有个抽象方法getInfor()，BMW，Das，Maze类继承Car类，并实现getInfor()方法。从键盘输入字母B,D,M其中一个，程序判断输入的字符，并创建以此为首字母类的对象，并调用getInfor()方法输出:This is XXX(XXX为类名)。根据已有程序，补全程序。

输入输出说明:

输入：
B
输出：
This is BMW

*/
import java.util.Scanner;

abstract class car {
	public abstract String getInfor();
}

//write code here
class BMW extends car {

	@Override
	public String getInfor() {
		// TODO Auto-generated method stub
		return "BMW";
	}
}

class Das extends car {

	@Override
	public String getInfor() {
		// TODO Auto-generated method stub
		return "Das";
	}
}

class Maze extends car {

	@Override
	public String getInfor() {
		// TODO Auto-generated method stub
		return "Maze";
	}
}

public class Main {
	public static void main(String[] args) {
		// write code here
		Scanner input = new Scanner(System.in);
		char s = input.next().charAt(0);
		switch (s) {
		case 'B': {
			System.out.println("This is " + (new BMW()).getInfor());
			break;
		}
		case 'D': {
			System.out.println("This is " + (new Das()).getInfor());
			break;
		}
		case 'M': {
			System.out.println("This is " + (new Maze()).getInfor());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + s);
		}
	}
}
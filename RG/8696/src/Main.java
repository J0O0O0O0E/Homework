
/*�}Ŀ����:

����һ��Car�࣬�����и����󷽷�getInfor()��BMW��Das��Maze��̳�Car�࣬��ʵ��getInfor()�������Ӽ���������ĸB,D,M����һ���������ж�������ַ����������Դ�Ϊ����ĸ��Ķ��󣬲�����getInfor()�������:This is XXX(XXXΪ����)���������г��򣬲�ȫ����

�������˵��:

���룺
B
�����
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
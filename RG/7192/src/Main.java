
/*題目內容:

有如下类:

interface Paper {
        public String GetName();

}

class Printer {
        public void Print(Paper p) {
                System.out.println(p.GetName());

        }

}

要求创建 A4Paper,A6Paper两个类,实现Paper接口，并实现GetName方法在main方法中创建Printer对象，并调用Print()方法两次,分别传入A4,A6类的对象,根据已有代码完成程序

输入输出说明:

输入:
A4 A6
输出:
A4
A6

*/
import java.util.Scanner;

interface Paper {
	public String GetName();

}

class Printer {
	public void Print(Paper p) {
		System.out.println(p.GetName());
	}
}

class A4Paper implements Paper {

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "A4";
	}

}

class A6Paper implements Paper {

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "A6";
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		switch (in.next()) {
		case "A4": {
			(new Printer()).Print(new A4Paper());
			break;
		}
		case "A6": {
			(new Printer()).Print(new A6Paper());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + in.next());
		}
		switch (in.next()) {
		case "A4": {
			(new Printer()).Print(new A4Paper());
			break;
		}
		case "A6": {
			(new Printer()).Print(new A6Paper());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + in.next());
		}
	}
}

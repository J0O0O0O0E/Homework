
/*�}Ŀ����:

��������:

interface Paper {
        public String GetName();

}

class Printer {
        public void Print(Paper p) {
                System.out.println(p.GetName());

        }

}

Ҫ�󴴽� A4Paper,A6Paper������,ʵ��Paper�ӿڣ���ʵ��GetName������main�����д���Printer���󣬲�����Print()��������,�ֱ���A4,A6��Ķ���,�������д�����ɳ���

�������˵��:

����:
A4 A6
���:
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

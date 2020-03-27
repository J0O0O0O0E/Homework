/*定义一个father类，类中有getInfor方法，用于返回“this is father ”加上用户从键盘输入的信息，再定义一个son类，继承father类，重写getInfor方法，用于返回“this is son”加上用户从键盘输入的信息。
输入输出说明:

输入：
hehe
输出：
this is father hehe
this is son hehe

*/
import java.util.Scanner;;
//write code here

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		father f = new father();
		System.out.println(f.getInfor(str));
		son s = new son();
		System.out.println(s.getInfor(str));
	}
}

class father {
	String s;

	public father() {
		super();
	}

	public String getInfor(String s) {
		this.s = s;
		return "this is father " + s;
	}
}

class son extends father {

	public String getInfor(String s) {
		this.s = s;
		return "this is son " + s;
	}

}
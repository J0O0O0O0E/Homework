
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

/*題目內容:

模拟向货船上装载集装箱，每个集装箱有一定重量，该重量（整数）大于100小于1000，货船总重为1000，装载若干集装箱后，如果货船超重，那么货船认为这是一个异常，将拒绝装载集装箱，但无论是否发生异常，货船都需要正点启航。

输入输出说明:

199
目前装载了199吨货物
400
目前装载了599吨货物
300
目前装载了899吨货物
300
超重
无法再装载重量是300吨的集装箱
货船将正点启航

*/
import java.util.Scanner;

class DangerException extends Exception {
	// starts
	int m;

	public DangerException(int m) {
		super();
		this.m = m;
	}

	public void info() {
		System.out.println("超重");
		System.out.println("无法再装载重量是" + m + "吨的集装箱");
	}

	public DangerException() {
	}
	// end
}

class CargoBoat {
	int realContent; // 装载的重量
	int maxContent; // 最大装载量

	public void setMaxContent(int c) {
		maxContent = c;
	}

	public void loading(int m) throws DangerException {
		// starts
		if (realContent + m > maxContent) {
			throw new DangerException(m);
		} else {
			realContent += m;
			System.out.println("目前装载了" + (realContent) + "吨货物");
		}
		// end
	}
}

public class Main {
	public static void main(String args[]) {
		CargoBoat ship = new CargoBoat();
		Scanner s = new Scanner(System.in);
		ship.setMaxContent(1000);
		int m = 0;
		try {
			// starts
			ship.realContent = 0;
			while (true) {
				m = s.nextInt();
				ship.loading(m);
			}
			// end
		} catch (DangerException e) {
			// starts
			e.info();
			// end
		} finally {
			System.out.printf("货船将正点启航");
		}
	}
}
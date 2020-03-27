import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		switch (name) {
		case "圆形": {
			float value = (float) input.nextDouble();
			System.out.println("圆形面积=" + 3.14 * Math.pow(value, 2));
			break;
		}
		case "矩形": {
			float value = (float) input.nextDouble();
			float value2 = (float) input.nextDouble();
			System.out.println("矩形面积=" + value * value2);
			break;
		}
		case "梯形": {
			System.out.println("输入的不是圆形或矩形");
			break;
		}
		default: {
			System.out.println("输入的不是圆形或矩形");
		}
		}
		input.close();
	}
}

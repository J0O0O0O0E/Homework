/*題目內容:

从键盘输入“圆形”或“矩形”，根据输入内容再输入必要的参数，计算圆形或矩形的面积并输出。

输入输出说明:

输入:圆形 10 
输出:圆形面积=314.0
输入:矩形 2 5
输出:矩形面积=10.0
输入:梯形
输出:输入的不是圆形或矩形

*/
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

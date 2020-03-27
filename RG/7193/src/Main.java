
/*題目內容:

输入华氏温度f，计算并输出相应的摄氏温度c。c=5*(f-50)/9+10.
输入输出说明:

输入:
17.2
输出：
The temprature is -8.22

*/
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double f = input.nextDouble();
		System.out.printf("The temprature is %.2f", (5 * (f - 50) / 9 + 10));
		input.close();
	}

}

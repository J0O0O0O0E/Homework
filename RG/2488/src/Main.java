
/*題目內容:
从键盘输入一个整形数n，如果输入正确的话，输出a*a后的值，如果输入错误的话输出wrong，最后输出end
输入输出说明:
输入：
4
输出：
16
end
输入：
asd
输出：
not int
end
*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println((int) Math.pow(in.nextInt(), 2));
		} catch (Exception e) {
			System.out.println("wrong");
		} finally {
			System.out.println("end");
		}
	}
}

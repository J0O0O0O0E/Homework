/*題目內容:

从键盘输入一个整形数n，如果输入正确的话，输出10-n后的值，如果输入错误的话输出“not int”

最后输出end


输入输出说明:

输入：
asd
输出：
not int
end

*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// write code here
		Scanner in = new Scanner(System.in);
		try {
			int m = in.nextInt();
			System.out.println(10 - m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("not int");
		} finally {
			System.out.println("end");
		}

	}
}

/*題目內容:

编写一个类ObjectCounter，用来统计程序中目前存在多少个该类的对象。测试代码已经在主函数中写出。

注意：

(1) 构造方法生成一个类对象

(2) 静态成员的定义与调用
输入输出说明:

输入：
6
输出：
6

*/
import java.util.*;

class ObjectCounter {

//write your code here
	static int n = 0;

	public ObjectCounter() {
		n++;
	}

	public static int getCount() {
		return n;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			ObjectCounter str1 = new ObjectCounter();
		}
		System.out.println(ObjectCounter.getCount());
	}
}

/*題目內容:

输入一个字符串,在输入一个字符

(1)在字符串中删除指定的字符并输出

(2)把(1)中得到的串逆序输出

输入输出说明:

输入：
goodagoodagood a
输出：
goodgoodgood
doogdoogdoog

*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
		s=s.replace(in.next(), "");
		System.out.println(s);
		System.out.println((new StringBuffer(s)).reverse());
	}
}


/*題目內容:

输入一个组中选修java课的学生名单以end结束，在输入选修C++课的学生名单以end结束，输出同时选两门课的同学名单*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> java = new ArrayList<>();
		List<String> cpp = new ArrayList<>();
		do {
			java.add(in.next());
		} while (!(java.get(java.size() - 1).equals("end")));
		java.remove(java.size() - 1);
		do {
			cpp.add(in.next());
		} while (!(cpp.get(cpp.size() - 1).equals("end")));
		cpp.remove(cpp.size() - 1);
		java.retainAll(cpp);
		for (int i = java.size() - 1; i >= 0; i--) {
			System.out.print(java.get(i) + " ");
		}
	}
}

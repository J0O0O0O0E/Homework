
/*�}Ŀ����:

����һ������ѡ��java�ε�ѧ��������end������������ѡ��C++�ε�ѧ��������end���������ͬʱѡ���ſε�ͬѧ����*/
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

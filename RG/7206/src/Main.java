/*�}Ŀ����:

����һ���ַ���,������һ���ַ�

(1)���ַ�����ɾ��ָ�����ַ������

(2)��(1)�еõ��Ĵ��������

�������˵��:

���룺
goodagoodagood a
�����
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

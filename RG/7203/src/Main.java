
/*�}Ŀ����:

��дһ����ObjectCounter������ͳ�Ƴ�����Ŀǰ���ڶ��ٸ�����Ķ��󡣲��Դ����Ѿ�����������д����

ע�⣺

(1) ���췽������һ�������

(2) ��̬��Ա�Ķ��������
�������˵��:

���룺
6
�����
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

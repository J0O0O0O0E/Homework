
/*�}Ŀ����:
�Ӽ�������һ��������n�����������ȷ�Ļ������a*a���ֵ������������Ļ����wrong��������end
�������˵��:
���룺
4
�����
16
end
���룺
asd
�����
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

/*�}Ŀ����:

�Ӽ�������һ��������n�����������ȷ�Ļ������10-n���ֵ������������Ļ������not int��

������end


�������˵��:

���룺
asd
�����
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
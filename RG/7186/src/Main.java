
/*�}Ŀ����:

�Ӽ�������һ���������ڸ��������в��Ҹ���������ҵ������������λ�ã�������������������С�����������int a[]={-2,1,4,5,8,12,17,23,45,56,90,100};

�������˵��:

���䣺8
�����8�������еĵ�4��Ԫ��
���䣺22
�����22����������

*/
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a[] = { -2, 1, 4, 5, 8, 12, 17, 23, 45, 56, 90, 100 };
		int x = input.nextInt(), flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println(x + "�������еĵ�" + i + "��Ԫ��");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(x + "����������");
		}
		input.close();
	}
}

/*�}Ŀ����:

�Ӽ������롰Բ�Ρ��򡰾��Ρ����������������������Ҫ�Ĳ���������Բ�λ���ε�����������

�������˵��:

����:Բ�� 10 
���:Բ�����=314.0
����:���� 2 5
���:�������=10.0
����:����
���:����Ĳ���Բ�λ����

*/
import java.util.*;

public class Main {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		switch (name) {
		case "Բ��": {
			float value = (float) input.nextDouble();
			System.out.println("Բ�����=" + 3.14 * Math.pow(value, 2));
			break;
		}
		case "����": {
			float value = (float) input.nextDouble();
			float value2 = (float) input.nextDouble();
			System.out.println("�������=" + value * value2);
			break;
		}
		case "����": {
			System.out.println("����Ĳ���Բ�λ����");
			break;
		}
		default: {
			System.out.println("����Ĳ���Բ�λ����");
		}
		}
		input.close();
	}
}


/*�}Ŀ����:

ģ���������װ�ؼ�װ�䣬ÿ����װ����һ��������������������������100С��1000����������Ϊ1000��װ�����ɼ�װ�������������أ���ô������Ϊ����һ���쳣�����ܾ�װ�ؼ�װ�䣬�������Ƿ����쳣����������Ҫ����������

�������˵��:

199
Ŀǰװ����199�ֻ���
400
Ŀǰװ����599�ֻ���
300
Ŀǰװ����899�ֻ���
300
����
�޷���װ��������300�ֵļ�װ��
��������������

*/
import java.util.Scanner;

class DangerException extends Exception {
	// starts
	int m;

	public DangerException(int m) {
		super();
		this.m = m;
	}

	public void info() {
		System.out.println("����");
		System.out.println("�޷���װ��������" + m + "�ֵļ�װ��");
	}

	public DangerException() {
	}
	// end
}

class CargoBoat {
	int realContent; // װ�ص�����
	int maxContent; // ���װ����

	public void setMaxContent(int c) {
		maxContent = c;
	}

	public void loading(int m) throws DangerException {
		// starts
		if (realContent + m > maxContent) {
			throw new DangerException(m);
		} else {
			realContent += m;
			System.out.println("Ŀǰװ����" + (realContent) + "�ֻ���");
		}
		// end
	}
}

public class Main {
	public static void main(String args[]) {
		CargoBoat ship = new CargoBoat();
		Scanner s = new Scanner(System.in);
		ship.setMaxContent(1000);
		int m = 0;
		try {
			// starts
			ship.realContent = 0;
			while (true) {
				m = s.nextInt();
				ship.loading(m);
			}
			// end
		} catch (DangerException e) {
			// starts
			e.info();
			// end
		} finally {
			System.out.printf("��������������");
		}
	}
}
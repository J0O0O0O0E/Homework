
/*�}Ŀ����:

��дһ��USB�ӿڳ���ģ�������������̺͹رչ�������������Ҫ������ꡢ���̡���˷��USB�豸������Ҫ�����£�
��1������һ���ӿ�USB�������������󷽷�turnOn()he turnOff(),�ֱ����ڱ�ʾUSB�豸�������͹ر�
��2����д���Mouse������KeyBoard����˷�Mic��,ʵ�ֽӿ��е�turnOn()��turnOff()��������������ʾ��XX�豸�����ˡ���XX�豸�ر��ˡ�����
��3����д�������Computer��Ҫ����һ����ʾ�������USB������������飻���USB�豸�ķ���add��USB usb��,����Ϊ�������в�ۣ�����п��еľ����һ��USB�豸
ģ�⿪������USB�豸��powerOn��������������Ϊ��������USB�ӿڣ����������USB�豸��������USB�豸��Ȼ����ʾ������������ɹ���
ģ��ػ��ر�USB�豸��powerOff��������������Ϊ��������USB�ӿڣ����������USB�豸����ر�USB�豸��Ȼ����ʾ��������ػ��ɹ���
��4����д�����࣬Ҫ������������󣬽�����ꡢ���̡���˷���󣬲���ӵ�������У�������������رռ����

�������˵��:

�����룻
�����
���������
����������
���������
����������ɹ�
���ر���
���̹ر���
��˹ر���
������ػ��ɹ�

*/
import java.util.*;

interface USB {
	void turnON();

	void turnOff();
}

class Mouse implements USB {

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("���������");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("���ر���");
	}
}

class KeyBoard implements USB {

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("���̹ر���");
	}
}

class Mic implements USB {

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("���������");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("��˹ر���");
	}
}

class Computer {
	List<USB> usbslots = new ArrayList<USB>();

	public void add(USB device) {
		usbslots.add(device);
	}

	public void powerOn() {
		if (usbslots.size() != 0) {
			for (USB i : usbslots) {
				i.turnON();
			}
		}
		System.out.println("����������ɹ�");
	}

	public void powerOff() {
		if (usbslots.size() != 0) {
			for (USB i : usbslots) {
				i.turnOff();
			}
		}
		System.out.println("������ػ��ɹ�");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Computer laptop = new Computer();
		laptop.add(new Mouse());
		laptop.add(new KeyBoard());
		laptop.add(new Mic());
		laptop.powerOn();
		laptop.powerOff();
	}
}
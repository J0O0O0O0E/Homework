
/*
��д���߳�Ӧ�ó���ģ����˹���ľ�ŵ�ģ�⡣��ľ��ÿ��ֻ��ͨ��һ���ˣ�ÿ����ͨ��ľ�ŵ�ʱ��Ϊ5�룬�������10���ˣ�
ͬʱ׼�����˶�ľ�ţ���ʾһ��ÿ��ͨ����ľ���˵���������Ҫ�õ��������
ע�⣺
��1���ٿ�ʼ����ʱ�����**��ʼ���ţ������ź������**�ѹ��ţ�

��2�����ѡ�˵�ʱ��ÿ���˶�Ҫѡ���������ظ�ѡ��
 */
import java.util.ArrayList;
import java.util.List;

class Bridge implements Runnable {

	 public synchronized void run() {
		System.out.println(Thread.currentThread().getName() + "��ʼ����!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "�ѹ���!");
	}
}
public class Main {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		List<String> list = new ArrayList<String>();
		for (int i = 'A'; i <= 'J'; i++) {
		    list.add(String.valueOf((char)i));
		}
		while (list.size()!=0) {
			int index = (int) (Math.random() * list.size());
			new Thread(bridge,list.get(index)).start();
			list.remove(index);
		}
	}
}



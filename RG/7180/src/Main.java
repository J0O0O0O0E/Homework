/*��������վ������������Ʊ���۵㣺��վ������վ������վ��
 * ����������������Ļ�Ʊ�ܹ���200�ţ�����ó�����ʵ��������Ʊ��ͬʱ��Ʊ�Ĺ��ܡ�
 * ע�⣺�����߳�ͬ�����⣬��������ظ���Ʊ���⡣��Ҫ����ͬ�����⡣*/
class Ticket implements Runnable {
	private int tickets = 200;

	@Override
	public void run() {
		while (tickets > 0) {
			synchronized (this) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (tickets > 0) {
					System.out.println(
							Thread.currentThread().getName() + "�����˵�" + (201 - tickets) + "��Ʊ,��ʣ" + (--tickets) + "��Ʊ");
				}
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		new Thread(ticket, "��վ").start();
		new Thread(ticket, "����վ").start();
		new Thread(ticket, "����վ").start();
	}
}

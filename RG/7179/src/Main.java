/*
���ö��̼߳�����дһ��ģ��������ܵĳ���Ҫ�����£�
��1���ڹ�ÿ����һ����λ������ÿ����10����λ��
��2��ÿ���߳�����ʱ���ж��Ƿ�ﵽ�յ㣬��������յ㣬������ʾ��Ϣ��δ���յ�����ʾĿǰ�����յ�ľ��룬���ж��Ƿ����ȣ�
��3������������ȣ�����ʾ�����ܵÿ죬˯һ������Ϣ����˯һ�ᡣ
 */
class Race implements Runnable {
	private static String winner;
	private volatile int rabbitdistance, turtledistance;

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (Thread.currentThread().getName().equals("����")) {
				if (gameover(i * 10)) {
					break;
				}
				rabbitdistance = i * 10;
				System.out.println(Thread.currentThread().getName() + "�����յ�" + (100 - i * 10));
				if (rabbitdistance > turtledistance) {
					System.out.println("���ܵÿ죬˯һ��");
					try {
						Thread.sleep(0, 1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (Thread.currentThread().getName().equals("�ڹ�")) {
				if (gameover(i)) {
					break;
				}
				turtledistance = i;
				System.out.println(Thread.currentThread().getName() + "�����յ�" + (100 - i));
			}
		}
	}

	private boolean gameover(int steps) {
		if (winner != null) {
			return true;
		}
		if (steps >= 100) {
			winner = Thread.currentThread().getName();
			System.out.println(winner + "��ʤ");
			return true;
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Race race = new Race();
		new Thread(race, "����").start();
		new Thread(race, "�ڹ�").start();
	}
}

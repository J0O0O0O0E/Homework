package test;

class MaiPiao2 implements Runnable {
	public static volatile int a=0, i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (i = 0; i <= 10; i++) {
			synchronized (this) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(a<=10) {
					System.out.println(Thread.currentThread().getName() + "���˵�" + i + "��Ʊ");
					a++;
				}
			}
		}
	}
}

public class Main {
	public static void main(String arg[]) {
		MaiPiao2 m = new MaiPiao2();
		new Thread(m, "����").start();
		new Thread(m, "����").start();
		new Thread(m, "��վ").start();
	}
}
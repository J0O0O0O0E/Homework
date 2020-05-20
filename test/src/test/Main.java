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
					System.out.println(Thread.currentThread().getName() + "卖了第" + i + "张票");
					a++;
				}
			}
		}
	}
}

public class Main {
	public static void main(String arg[]) {
		MaiPiao2 m = new MaiPiao2();
		new Thread(m, "哈西").start();
		new Thread(m, "哈东").start();
		new Thread(m, "哈站").start();
	}
}
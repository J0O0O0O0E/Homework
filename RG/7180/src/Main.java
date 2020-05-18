/*哈尔滨火车站下面有三个火车票代售点：哈站、哈东站、哈西站，
 * 假如哈尔滨到北京的火车票总共是200张，如何用程序来实现三个售票点同时卖票的功能。
 * 注意：考虑线程同步问题，避免出现重复卖票问题。需要考虑同步问题。*/
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
							Thread.currentThread().getName() + "出售了第" + (201 - tickets) + "张票,还剩" + (--tickets) + "张票");
				}
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		new Thread(ticket, "哈站").start();
		new Thread(ticket, "哈东站").start();
		new Thread(ticket, "哈西站").start();
	}
}

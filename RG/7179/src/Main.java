/*
利用多线程技术编写一个模拟龟兔赛跑的程序，要求如下：
（1）乌龟每次跑一个单位，兔子每次跑10个单位；
（2）每个线程运行时，判断是否达到终点，如果到达终点，给出提示信息，未到终点则提示目前距离终点的距离，并判断是否领先；
（3）如果兔子领先，则显示“我跑得快，睡一觉”信息，并睡一会。
 */
class Race implements Runnable {
	private static String winner;
	private volatile int rabbitdistance, turtledistance;

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (Thread.currentThread().getName().equals("兔子")) {
				if (gameover(i * 10)) {
					break;
				}
				rabbitdistance = i * 10;
				System.out.println(Thread.currentThread().getName() + "距离终点" + (100 - i * 10));
				if (rabbitdistance > turtledistance) {
					System.out.println("我跑得快，睡一觉");
					try {
						Thread.sleep(0, 1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (Thread.currentThread().getName().equals("乌龟")) {
				if (gameover(i)) {
					break;
				}
				turtledistance = i;
				System.out.println(Thread.currentThread().getName() + "距离终点" + (100 - i));
			}
		}
	}

	private boolean gameover(int steps) {
		if (winner != null) {
			return true;
		}
		if (steps >= 100) {
			winner = Thread.currentThread().getName();
			System.out.println(winner + "获胜");
			return true;
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Race race = new Race();
		new Thread(race, "兔子").start();
		new Thread(race, "乌龟").start();
	}
}

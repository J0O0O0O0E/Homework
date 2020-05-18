
/*
编写多线程应用程序，模拟多人过独木桥的模拟。独木桥每次只能通过一个人，每个人通过木桥的时间为5秒，随机生成10个人，
同时准备过此独木桥，显示一下每次通过独木桥人的姓名。需要用到随机数。
注意：
（1）再开始过桥时输出：**开始过桥！过完桥后输出：**已过桥！

（2）随机选人的时候，每个人都要选到，不能重复选。
 */
import java.util.ArrayList;
import java.util.List;

class Bridge implements Runnable {

	 public synchronized void run() {
		System.out.println(Thread.currentThread().getName() + "开始过桥!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "已过桥!");
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




/*題目內容:

编写一个USB接口程序，模拟计算机启动过程和关闭过程启动过程中要加载鼠标、键盘、麦克风等USB设备，具体要求如下：
（1）定义一个接口USB，包含两个抽象方法turnOn()he turnOff(),分别用于表示USB设备的启动和关闭
（2）编写鼠标Mouse、键盘KeyBoard、麦克风Mic类,实现接口中的turnOn()、turnOff()方法，方法中显示“XX设备启动了”或“XX设备关闭了”即可
（3）编写计算机类Computer，要求有一个表示计算机上USB插槽数量的数组；添加USB设备的方法add（USB usb）,功能为遍历所有插槽，如果有空闲的就添加一个USB设备
模拟开机启动USB设备的powerOn（）方法，功能为遍历所有USB接口，如果连接了USB设备，则启动USB设备，然后显示“计算机开机成功”
模拟关机关闭USB设备的powerOff（）方法，功能为遍历所有USB接口，如果连接了USB设备，则关闭USB设备，然后显示“计算机关机成功”
（4）编写测试类，要求建立计算机对象，建立鼠标、键盘、麦克风对象，并添加到计算机中，启动计算机，关闭计算机

输入输出说明:

无输入；
输出：
鼠标启动了
键盘启动了
麦克启动了
计算机开机成功
鼠标关闭了
键盘关闭了
麦克关闭了
计算机关机成功

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
		System.out.println("鼠标启动了");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("鼠标关闭了");
	}
}

class KeyBoard implements USB {

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("键盘启动了");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("键盘关闭了");
	}
}

class Mic implements USB {

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("麦克启动了");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("麦克关闭了");
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
		System.out.println("计算机开机成功");
	}

	public void powerOff() {
		if (usbslots.size() != 0) {
			for (USB i : usbslots) {
				i.turnOff();
			}
		}
		System.out.println("计算机关机成功");
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